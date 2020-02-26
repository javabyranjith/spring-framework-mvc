package jbr.springmvc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import jbr.springmvc.model.Person;
import jbr.springmvc.view.ExcelViewResolver;
import jbr.springmvc.view.Jaxb2MarshallingXmlViewResolver;
import jbr.springmvc.view.JsonViewResolver;
import jbr.springmvc.view.PdfViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "jbr.springmvc" })
public class AppConfig extends WebMvcConfigurationSupport {

  @Override
  public void configureContentNegotiation(ContentNegotiationConfigurer negotiationConfigurer) {
    negotiationConfigurer.ignoreAcceptHeader(true).defaultContentType(MediaType.TEXT_HTML);
  }

  @Bean
  public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager negotiationManager) {
    ContentNegotiatingViewResolver negotiatingViewResolver = new ContentNegotiatingViewResolver();
    negotiatingViewResolver.setContentNegotiationManager(negotiationManager);

    List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();

    viewResolvers.add(viewResolver()); // default

    viewResolvers.add(jaxb2MarshallingXmlViewResolver());
    viewResolvers.add(jsonViewResolver());
    viewResolvers.add(pdfViewResolver());
    viewResolvers.add(excelViewResolver());

    negotiatingViewResolver.setViewResolvers(viewResolvers);

    return negotiatingViewResolver;
  }

  @Bean
  public ViewResolver jaxb2MarshallingXmlViewResolver() {
    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    jaxb2Marshaller.setClassesToBeBound(Person.class);

    return new Jaxb2MarshallingXmlViewResolver(jaxb2Marshaller);
  }

  @Bean
  public ViewResolver jsonViewResolver() {
    return new JsonViewResolver();
  }

  @Bean
  public ViewResolver pdfViewResolver() {
    return new PdfViewResolver();
  }

  @Bean
  public ViewResolver excelViewResolver() {
    return new ExcelViewResolver();
  }

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setViewClass(JstlView.class);
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");

    return viewResolver;
  }

}

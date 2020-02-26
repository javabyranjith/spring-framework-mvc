package jbr.springmvc.view;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class JsonViewResolver implements ViewResolver {

  @Override
  public View resolveViewName(String viewName, Locale locale) throws Exception {
    MappingJackson2JsonView jackson2JsonView = new MappingJackson2JsonView();
    jackson2JsonView.setPrettyPrint(true);

    return jackson2JsonView;
  }

}

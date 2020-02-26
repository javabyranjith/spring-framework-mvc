package jbr.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  public String hello(ModelMap map) {
    map.put("message", "HELLO. Welcome to Spring MVC using MAVEN!!!");

    return "hello";
  }

  @RequestMapping("/bye")
  public String bye(ModelMap map) {
    map.put("message", "GOOD BYE. Meet you soon!!!");

    return "bye";
  }
}

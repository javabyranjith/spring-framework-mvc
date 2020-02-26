package jbr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("user")
  public String user(Model model) {
    System.out.println("user method");
    model.addAttribute("message", "User Page");

    return "user";
  }

  @GetMapping("product")
  public String product(Model model) {
    model.addAttribute("message", "Product Page");

    return "product";
  }
}

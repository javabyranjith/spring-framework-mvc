package jbr.springmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jbr.springmvc.model.Product;
import jbr.springmvc.util.ProductUtil;

@Controller
public class ProductController {

  @GetMapping("/")
  public String expandcollapse(Model model) {
    List<List<Product>> productList = Arrays.asList(ProductUtil.mobiles(), ProductUtil.laptops(), ProductUtil.tablets(),
        ProductUtil.televisions(), ProductUtil.washers());
    model.addAttribute("productList", productList);

    return "expand-collapse";
  }

  @GetMapping({ "/welcome", "/hello" })
  public String hello(Model model) {
    model.addAttribute("message", "Hello. Welcome!!");

    return "greeting";
  }

}

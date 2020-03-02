package jbr.springmvc.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jbr.springmvc.model.Product;
import jbr.springmvc.util.ProductUtil;

@Controller
public class ProductController {

  @GetMapping("/list")
  public String list(Model model) throws IOException {

    List<Product> productsObject = ProductUtil.generateProductObjectList();
    List<String> productsName = productsObject.stream().map(e -> e.getName()).collect(Collectors.toList());

    model.addAttribute("productsObject", productsObject);
    model.addAttribute("productsName", productsName);
    return "list";
  }

  @GetMapping("/map")
  public String map(Model model) throws IOException {

    List<Product> productsObject = ProductUtil.generateProductObjectList();
    Map<String, String> productsMap = productsObject.stream()
        .collect(Collectors.toMap(Product::getId, Product::getName));

    model.addAttribute("productsMap", productsMap);
    return "map";
  }

}

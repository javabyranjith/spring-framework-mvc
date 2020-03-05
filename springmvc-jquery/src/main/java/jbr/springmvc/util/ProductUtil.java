package jbr.springmvc.util;

import java.util.Arrays;
import java.util.List;

import jbr.springmvc.model.Product;

public class ProductUtil {

  public static List<Product> mobiles() {
    return Arrays.asList(new Product("101", "Samsung J7", "Mobile", "Samsung smart phone", "7000"),
        new Product("102", "Realme J10", "Mobile", "Redmi smart phone", "9000"));
  }

  public static List<Product> laptops()  {
    return Arrays.asList(new Product("201", "Acer T43", "Laptop", "Acer gaming laptop", "41000"),
        new Product("202", "Dell 300", "Laptop", "Dell Vostro laptop", "71000"));
  }

  public static List<Product> tablets()  {
    return Arrays.asList(new Product("301", "Samsung Tab 10", "Tablet", "Samsung multimedia Tablet PC", "21000"),
        new Product("302", "Levono Tab 4D", "Tablet", "Lenovo Tablet PC", "33000"));
  }

  public static List<Product> televisions()  {
    return Arrays.asList(new Product("401", "LG Television", "Television", "LG Smart TV 32", "15000"),
        new Product("402", "Samsung Television", "Television", "Samsung Smart TV 41", "35000"));
  }

  public static List<Product> washers()  {
    return Arrays
        .asList(
            new Product("501", "Simens Washing Machine", "Washing machine", "Simens heavy load washing machine 6.5kg",
                "25000"),
            new Product("502", "LG Washing Machine", "Washing machine", "LG washing machine 5.5kg", "15000"));
  }

}

package jbr.springmvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jbr.springmvc.model.Person;

@Controller
public class PersonController {

  @Autowired
  private Map<String, Person> personList;

  @GetMapping(value = "/persons/{personsName}")
  public String getPersons(@PathVariable String personsName, ModelMap model) {
    System.out.println(personList.get(personsName).getAddress());
    model.addAttribute("person", personList.get(personsName));

    return "personInfo";
  }

  @GetMapping(value = "/person/{personName}")
  public String getPerson(@PathVariable("personName") String name, ModelMap model) {
    System.out.println(personList.get(name).getAddress());
    model.addAttribute("person", personList.get(name));

    return "personInfo";
  }
  
  
}

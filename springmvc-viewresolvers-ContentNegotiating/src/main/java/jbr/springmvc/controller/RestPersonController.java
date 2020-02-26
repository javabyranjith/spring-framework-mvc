package jbr.springmvc.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jbr.springmvc.model.Person;
import jbr.springmvc.model.Persons;

@Controller
public class RestPersonController {

  @RequestMapping("/rest-persons")
  @ResponseBody
  public Persons getPersons() {
    Persons pers = new Persons();
    pers.addPersons(Arrays.asList(new Person("kumar")));

    return pers;
  }
}

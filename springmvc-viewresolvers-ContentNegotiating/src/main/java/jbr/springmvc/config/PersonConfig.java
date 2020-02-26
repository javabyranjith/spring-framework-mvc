package jbr.springmvc.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jbr.springmvc.model.Person;

@Configuration
public class PersonConfig {

  @Bean
  public String[] strArray(){
      return new String[]{"two", "three", "four"};
  }
  
  @Bean
  public Map<String, Person> personList() {
    Map<String, Person> persons = new HashMap<>();

    Person ranjith = new Person();
    ranjith.setName("ranjith");
    ranjith.setAddress("chennai");
    ranjith.setPhone(98989);
    persons.put("ranjith", ranjith);

    Person kabilan = new Person();
    kabilan.setName("kabilan");
    kabilan.setAddress("hydrabad");
    kabilan.setPhone(77777);
    persons.put("kabilan", kabilan);

    return persons;
  }
}

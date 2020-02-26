package jbr.springmvc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

  private String name;
  private String address;
  private int phone;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
    this.address = "chennai";
    this.phone = 86868;
  }

  public String getName() {
    return name;
  }

  @XmlElement
  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  @XmlElement
  public void setAddress(String address) {
    this.address = address;
  }

  public int getPhone() {
    return phone;
  }

  @XmlElement
  public void setPhone(int phone) {
    this.phone = phone;
  }

}

package jbr.springmvc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

//@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
//@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

 /*  @Autowired
  UserService userService;

  @Before
  public void setUp() throws Exception {
  }

 @Test
  public void testValidateUser() {

    Login login = new Login();
    login.setUsername("ranjith");
    login.setPassword("sekar");

    User user = userService.validateUser(login);

    assertEquals("Ranjith", user.getFirstname());
  }*/

}

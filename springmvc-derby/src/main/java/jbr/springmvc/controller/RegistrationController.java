package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

public class RegistrationController extends MultiActionController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		return mav;
	}

	public ModelAndView registerProcess(HttpServletRequest request, HttpServletResponse response) {
		User user = new User();

		String username = request.getParameter("username").toString();
		user.setUsername(username);

		String password = request.getParameter("password").toString();
		user.setPassword(password);

		String firstname = request.getParameter("firstname").toString();
		user.setFirstname(firstname);

		String lastname = request.getParameter("lastname").toString();
		user.setLastname(lastname);

		String email = request.getParameter("email").toString();
		user.setEmail(email);

		String address = request.getParameter("address").toString();
		user.setAddress(address);

		String phone = request.getParameter("phone").toString();
		user.setPhone(Integer.valueOf(phone));

		userService.register(user);

		return new ModelAndView("welcome", "firstname", user.getFirstname());
	}
}

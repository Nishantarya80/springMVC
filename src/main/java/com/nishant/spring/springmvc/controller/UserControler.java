package com.nishant.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nishant.spring.springmvc.dao.User;

@Controller
public class UserControler {

	/*
	 * @RequestMapping("registration") public ModelAndView showRegistrationPage() {
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.setViewName("userReg"); return modelAndView; }
	 * 
	 * @RequestMapping(value="registerUser",method = RequestMethod.POST ) public
	 * ModelAndView RegisterUser(@ModelAttribute("user") User user) {
	 * System.out.println(user); ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.addObject("user",user); modelAndView.setViewName("regResult");
	 * return modelAndView; }
	 * 
	 */

	// with string and modelMap
	@RequestMapping("registration")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String RegisterUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "regResult";
	}
}

package com.nishant.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nishant.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("john");
		employee.setSalary(10000);
		modelAndView.addObject("employee",employee);
		return modelAndView;
	}

}

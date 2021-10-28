package com.nishant.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nishant.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("john");
		employee.setSalary(10000);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("nishant");
		employee2.setSalary(30000);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("piyush");
		employee3.setSalary(50000);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);

		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}

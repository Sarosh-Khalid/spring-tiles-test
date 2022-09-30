package com.usermanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.javatpoint.form.Contact;
import com.usermanager.model.Employee;
import com.usermanager.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("employee")Employee employee, BindingResult result) {
		//write the code here to add contact
		System.out.print(employee);
		employeeService.save(employee);
		return "redirect:employee.html";
	}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee")Employee employee, BindingResult result) {
		//write the code here to add contact
		System.out.print(employee);
		employeeService.update(employee);
		return "redirect:employee.html";
	}
	
	@RequestMapping("/employee")
	public String showContacts(Model m) {
		m.addAttribute("command", new Employee());
		return "employee";
	}
	
	@RequestMapping("/home")
	public String getEmployees(Model m) {
		m.addAttribute("users", employeeService.getAllEmployees());
		return "home";
		
	}
	
	@RequestMapping("/edit/{id}")
	public String editEmployee(@ModelAttribute("employee")Employee employee, BindingResult result, Model m, @PathVariable String id) {
		//Employee employee = employeeService.getEmployee(Integer.parseInt(id));
		m.addAttribute("employee", employeeService.getEmployee(Integer.parseInt(id)));
		m.addAttribute("command", employeeService.getEmployee(Integer.parseInt(id)));
		return "employeeupdate";
		
	}

}

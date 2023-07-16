package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.app.entity.Employee;
import com.example.app.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeContoller {
	@Autowired
	private IEmployeeService service;

	public void setService(IEmployeeService service) {
		this.service = service;
	}
	@GetMapping("/show")
	public String show() {
		return "EmployeeRegister";
	}
	@PostMapping("/register")
	public String saveEmployee(@ModelAttribute Employee emp) {
		service.saveEmployee(emp);
		return "redirect:all";
	}
	@GetMapping("/all")
	public String showEmployees(Model model) {
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list", list);
		return "employeeData";
	}
	//http://6030/em[loyee/remove?id=1
	@GetMapping("/remove")
	public String removeEmployee(@RequestParam Integer id) {
		service.deleteEmployeeById(id);
		return "redirect:all";
	}
	@GetMapping("/edit")
	public String editEmployee(@RequestParam Integer id,Model model) {
		Employee emp =service.getEmployeeById(id);
		model.addAttribute("emp", emp);
		return "EmployeeEdit";
	}
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
		return "redirect:all";
		
	}
}

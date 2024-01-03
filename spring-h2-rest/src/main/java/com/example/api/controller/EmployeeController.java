package com.example.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dao.EmployeeRepository;
import com.example.api.model.Employee;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee Saved";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/getAllEmployees/{id}")
	public Optional<Employee> getEmployeeByDept(@PathVariable int id){
		return employeeRepository.findById(id);
	}
}

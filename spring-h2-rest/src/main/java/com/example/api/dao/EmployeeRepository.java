package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

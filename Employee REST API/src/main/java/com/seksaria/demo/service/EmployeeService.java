package com.seksaria.demo.service;

import java.util.List;

import com.seksaria.demo.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeByID(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}

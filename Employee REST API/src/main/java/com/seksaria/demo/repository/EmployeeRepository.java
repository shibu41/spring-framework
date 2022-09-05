package com.seksaria.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seksaria.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}

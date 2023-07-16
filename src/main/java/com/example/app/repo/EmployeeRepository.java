package com.example.app.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

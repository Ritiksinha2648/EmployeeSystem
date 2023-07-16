package com.example.app.service;

import java.util.List;

import com.example.app.entity.Employee;

public interface IEmployeeService {
void saveEmployee(Employee emp);
List<Employee> getAllEmployees();
void deleteEmployeeById(Integer id);
Employee getEmployeeById(Integer id);
void updateEmployee(Employee emp);
}

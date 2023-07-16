package com.example.app.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entity.Employee;
import com.example.app.repo.EmployeeRepository;


@Service
public class EmployeeRegisterImpl implements IEmployeeService {
	@Autowired
    private   EmployeeRepository repository;


	@Override
	public void saveEmployee(Employee emp) {
		
repository.save(emp);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}


	@Override
	public void deleteEmployeeById(Integer id) {
repository.deleteById(id);		
	}


	@Override
	public Employee getEmployeeById(Integer id) {
	Optional<Employee> opt =	repository.findById(id);
	
		if(opt.isEmpty()) {
			return null;
			
		}
		return opt.get();
		}


	@Override
	public void updateEmployee(Employee emp) {
repository.save(emp);		
	}

}

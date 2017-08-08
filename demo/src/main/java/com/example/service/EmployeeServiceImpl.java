/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmployeeRepository;
/**
 * @author DARPAN
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#getEmployeeById(long)
	 */
	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.example.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}

/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.model.Employee;
/**
 * @author DARPAN
 *
 */
public interface EmployeeService {
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
}

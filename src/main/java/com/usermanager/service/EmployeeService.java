package com.usermanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanager.DAO.*;
import com.usermanager.model.*;


@Service
public class EmployeeService {

	@Autowired
    private EmployeeDAO employeeDAO;
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
	
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}
	
	public void update(Employee employee) {
		employeeDAO.update(employee);
	}
	
	public void delete(int employeeId) {
		employeeDAO.delete(employeeId);
	}
	
	public Employee getEmployee(int employeeId) {
		return employeeDAO.getEmployee(employeeId);
	}
	
}

package com.usermanager.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.usermanager.model.*;

@Component
public class EmployeeDAO {
	
	@PersistenceContext(unitName = "UsersPU")
	private EntityManager em;
	
	public List<Employee> getAllEmployees() {
        TypedQuery<Employee> query = em.createQuery(
        		"SELECT e FROM Employee e ORDER BY e.id", Employee.class);
        return query.getResultList();
    }
	
	@Transactional
	public void delete(int employeeId) {
		Employee employee = em.getReference(Employee.class, employeeId);
		em.remove(employee);
	}
	
	@Transactional
	public void save(Employee employee) {
		em.persist(employee);
	}
	
	@Transactional
	public void update(Employee employee) {
		em.merge(employee);
	}
	
	
	public Employee getEmployee(int employeeId) {
		return em.find(Employee.class, employeeId);
	}

}

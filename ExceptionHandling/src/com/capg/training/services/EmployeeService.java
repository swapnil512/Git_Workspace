package com.capg.training.services;

import com.capg.training.dto.Employee;
import com.capg.training.exceptions.EmployeeAgeException;

public class EmployeeService {

	public boolean checkAge(Employee emp) throws EmployeeAgeException {
		if (emp.getEmployeeAge() < 16) {
			throw new EmployeeAgeException("Age " + emp.getEmployeeAge()
					+ " is too less ");
		} else if (emp.getEmployeeAge() > 60) {
			throw new EmployeeAgeException("Age " + emp.getEmployeeAge()
					+ " is too high ");
		} else
			return true;
	}
}

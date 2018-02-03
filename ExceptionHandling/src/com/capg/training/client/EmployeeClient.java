package com.capg.training.client;

import java.util.Scanner;

import com.capg.training.dto.Employee;
import com.capg.training.exceptions.EmployeeAgeException;
import com.capg.training.services.EmployeeService;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age of the employee");
		int age = scanner.nextInt();
		
		Employee e1 = new Employee();
		e1.setEmployeeAge(age);
		
		EmployeeService ES = new EmployeeService();
		
		try {
			ES.checkAge(e1);
			System.out.println("Info Is being processed...");
		} catch (EmployeeAgeException e) {
			System.out.println("Age entered is incorrect as "+e.getMessage());
		}
	}

}

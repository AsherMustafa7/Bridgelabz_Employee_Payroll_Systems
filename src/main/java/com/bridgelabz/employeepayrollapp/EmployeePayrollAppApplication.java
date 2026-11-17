
/*
 * File: EmployeePayrollAppApplication.java
 * Description: Main entry point of the Employee Payroll Spring Boot
 * application. It starts the Spring Boot application and initializes
 * the Spring application context.
 *
 * Name: Asher Mustafa
 * @author Asher
 * Date: 16/11/2026
 */

package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// [Asher Mustafa]: Enables Spring Boot auto-configuration and component scanning.
@SpringBootApplication
public class EmployeePayrollAppApplication {

	// [Asher Mustafa]: Main method to launch the Employee Payroll application.
	public static void main(String[] args) {

		SpringApplication.run(EmployeePayrollAppApplication.class, args);
	}
}


/*
 * File: EmployeePayrollModel.java
 * Description: Model class representing employee payroll
 *              information with name and salary.
 *
 * Name: Asher Mustafa
 * @author Asher
 * Date: 16/11/2026
 */

package com.bridgelabz.employeepayrollapp.model;

public class EmployeePayrollModel {

    // [Asher Mustafa]: Employee payroll attributes.
    private String name;
    private double salary;

    // [Asher Mustafa]: Default constructor.
    public EmployeePayrollModel() {
    }

    // [Asher Mustafa]: Parameterized constructor.
    public EmployeePayrollModel(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // [Asher Mustafa]: Getter and setter for employee name.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // [Asher Mustafa]: Getter and setter for employee salary.
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

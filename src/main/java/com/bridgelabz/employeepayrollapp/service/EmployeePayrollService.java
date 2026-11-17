
/*
 * File: EmployeePayrollService.java
 * Description: Service layer that stores, retrieves, updates and
 *              deletes Employee Payroll data using an in-memory List.
 *
 * Name: Asher Mustafa
 * @author Asher
 * Date: 16/11/2026
 */

package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeePayrollService {

    // [Asher Mustafa]: In-memory collection for storing employee payroll records.
    private final List<EmployeePayrollModel> employeePayrollList =
            new ArrayList<>();

    // [Asher Mustafa]: Return all employee payroll records.
    public List<EmployeePayrollModel> getEmployeePayrollData() {
        return employeePayrollList;
    }

    // [Asher Mustafa]: Return an employee using a 1-based position as the requested ID.
    public EmployeePayrollModel getEmployeePayrollDataById(int id) {
        int index = id - 1;

        if (index < 0 || index >= employeePayrollList.size()) {
            return null;
        }

        return employeePayrollList.get(index);
    }

    // [Asher Mustafa]: Convert DTO into Model and add it to the in-memory List.
    public EmployeePayrollModel addEmployeePayrollData(
            EmployeePayrollDTO employeeDTO) {

        EmployeePayrollModel employee = new EmployeePayrollModel(
                employeeDTO.getName(),
                employeeDTO.getSalary()
        );

        employeePayrollList.add(employee);

        return employee;
    }

    // [Asher Mustafa]: Update the first employee because the specified PUT endpoint
    // [Asher Mustafa]: does not provide an employee ID.
    public EmployeePayrollModel updateEmployeePayrollData(
            EmployeePayrollDTO employeeDTO) {

        if (employeePayrollList.isEmpty()) {
            return null;
        }

        EmployeePayrollModel employee = new EmployeePayrollModel(
                employeeDTO.getName(),
                employeeDTO.getSalary()
        );

        employeePayrollList.set(0, employee);

        return employee;
    }

    // [Asher Mustafa]: Delete an employee using a 1-based position as the requested ID.
    public Map<String, Object> deleteEmployeePayrollData(int id) {
        int index = id - 1;

        if (index < 0 || index >= employeePayrollList.size()) {
            return Map.of(
                    "message", "Employee not found",
                    "id", id
            );
        }

        employeePayrollList.remove(index);

        return Map.of(
                "message", "Employee deleted successfully",
                "id", id
        );
    }
}

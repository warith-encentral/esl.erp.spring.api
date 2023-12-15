package com.encentral.erp.hrm.employee.management.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private double currentSalary;

    public Employee() {}

    public Employee(String employeeId, String firstName, String lastName, LocalDate dob, double currentSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.currentSalary = currentSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", currentSalary=" + currentSalary +
                '}';
    }
}

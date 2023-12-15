package com.encentral.erp.hrm.employee.management.api;

import com.encentral.erp.hrm.employee.management.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeManagement {

    Optional<Employee> getEmployee(String employeeId);
    List<Employee> getAllEmployees();
}

package com.encentral.erp.hrm.employee.management.api;

import com.encentral.erp.hrm.employee.management.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IEmployeeManagement {

    Optional<Employee> getEmployee(String employeeId);
    List<Employee> getAllEmployees();
}

package com.encentral.erp.hrm.employee.management.impl;

import com.encentral.erp.hrm.employee.management.api.IEmployeeManagement;
import com.encentral.erp.hrm.employee.management.model.Employee;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Component
public class DefaultEmployeeManagementImpl implements IEmployeeManagement {
    @Override
    public Optional<Employee> getEmployee(String employeeId) {
        return Optional.of(new Employee(
                employeeId,
                "John",
                "Doe",
                LocalDate.of(1996, Month.APRIL, 22),
                54.0)
        );
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}

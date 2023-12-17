package com.encentral.erp.gateway.controller.hrm.employee.management;

import com.encentral.erp.hrm.employee.management.api.IEmployeeManagement;
import com.encentral.erp.hrm.employee.management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    IEmployeeManagement iEmployeeManagement;

    @Autowired
    public EmployeeController(IEmployeeManagement iEmployeeManagement) {
        this.iEmployeeManagement = iEmployeeManagement;
    }

    @GetMapping("get-employee/")
    public Employee getEmployee() {
        return iEmployeeManagement.getEmployee("Some Employee ID").orElseThrow();
    }
}

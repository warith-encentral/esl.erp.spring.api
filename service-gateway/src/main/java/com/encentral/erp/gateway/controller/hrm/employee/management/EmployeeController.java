package com.encentral.erp.gateway.controller.hrm.employee.management;

import com.encentral.erp.hrm.employee.management.api.IEmployeeManagement;
import com.encentral.erp.hrm.employee.management.impl.DefaultEmployeeManagementImpl;
import com.encentral.erp.hrm.employee.management.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    IEmployeeManagement iEmployeeManagement = new DefaultEmployeeManagementImpl();

    @GetMapping("get-employee/")
    public Employee getEmployee() {
        return iEmployeeManagement.getEmployee("Some Employee ID").orElseThrow();
    }
}

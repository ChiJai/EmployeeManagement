package com.employeeManagement.Controller;

import com.employeeManagement.Entities.Company;
import com.employeeManagement.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.employeeManagement.Service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //@PostMapping("/Employee")
//    public Employee addCompany(Employee employee){
//    return this.employeeService.addEmployee(employee);
//}
    @PostMapping("/Companies")
    public void addCompany(@RequestBody Company company) {
        this.employeeService.addCompany(company);
        System.out.println("Company added");
    }

    @PostMapping("/Employee")
    public void addEmployee(@RequestBody Employee employee, @RequestParam Long companyId) {
        this.employeeService.addEmployee(employee, companyId);
        System.out.println("Employee added");
    }

    @GetMapping("/employee/{companyId}")
    public List<Employee> getEmployee(@PathVariable Long companyId) {
        System.out.println("we have get the id");
        return this.employeeService.getEmployee(companyId);

        //System.out.println("we have get the id");
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable Long employeeId) {
        System.out.println("we have updated the employee");
        Employee employee = this.employeeService.updateEmployee(employeeId);
        return employee;
    }
}

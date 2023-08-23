package com.employeeManagement.Service;

import com.employeeManagement.Entities.Company;
import com.employeeManagement.Entities.Employee;
import com.employeeManagement.Repository.CompanyRepo;
import com.employeeManagement.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class EmployeeServiceImpl implements EmployeeService  {
    //postmapping implementation
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    CompanyRepo companyRepo;
    public Company addCompany(Company company){
        return this.companyRepo.save(company);
    }
    public Employee addEmployee(Employee employee,Long companyId){
        Company company = companyRepo.findByCompanyId(companyId);
        employee.setCompany(company);
        return this.employeeRepo.save(employee);
}
    public List<Employee> getEmployee(Long compId){
        List<Employee>list;
        Company company = companyRepo.findByCompanyId(compId);
        list = employeeRepo.findByCompany(company);
        return list;
    }
    public Employee updateEmployee(Long employeeId){
        Employee employee = employeeRepo.findByEmployeeId(employeeId);
//        employee.setEmployeeId(employee.getEmployeeId());
//        employee.setGender(employee.getGender());
//        employee.setJoining(employee.getJoining());
//        employee.setCompany(employee.getCompany());
//        employee.setInCompany(employee.getInCompany());
//        employee.setLeaving(employee.getLeaving());
        employee.setOutCompany(true);
        return this.employeeRepo.save(employee);
    }
}

package com.employeeManagement.Service;

import com.employeeManagement.Entities.Company;
import com.employeeManagement.Entities.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;

public interface EmployeeService {
    public Company addCompany(Company company);
     public Employee addEmployee(Employee employee,Long companyId);
    public List<Employee> getEmployee(Long compId);
    public Employee updateEmployee(Long employeeId);

}

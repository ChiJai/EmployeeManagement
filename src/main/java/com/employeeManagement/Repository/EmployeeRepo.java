package com.employeeManagement.Repository;

import com.employeeManagement.Entities.Company;
import com.employeeManagement.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
  List<Employee> findByEmployeeId(Company company);
  List<Employee> findByCompanyCompanyId(Company company);
  List<Employee> findByCompany(Company company);

}

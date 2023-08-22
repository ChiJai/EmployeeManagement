package com.employeeManagement.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.sql.ast.tree.from.MappedByTableGroup;
import java.util.*;
import java.util.Date;

@Entity
@Data
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String companyName;
    private String sector;
    private Date originated;
    private Boolean companyStatus = true; //this represents company is there or not
    //we need to map with employee table and need to get the different employee details with one company
    @OneToMany(cascade = CascadeType.ALL)
    List<Employee> employeeList = new ArrayList<>();
}

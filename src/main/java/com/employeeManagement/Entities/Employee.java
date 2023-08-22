package com.employeeManagement.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name = "employee")
@Data
//@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    private String gender;
    private Date joining;
    private Date leaving;
    private Boolean inCompany = true;
    private Boolean outCompany = false;
    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;
}

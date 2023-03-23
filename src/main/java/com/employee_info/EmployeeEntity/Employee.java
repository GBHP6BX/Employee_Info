package com.employee_info.EmployeeEntity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String gender;

    private long employeeId;

    @JoinColumn(name = "designation_id")
    @ManyToOne(cascade=CascadeType.ALL)
    private EmployeeDesignationEntity designation;

    @JoinColumn(name = "employee_skill")
    @ManyToMany(cascade=CascadeType.ALL)
    private List<EmployeeSkillEntity> skillName;

    @Column(length = 10,unique = true)
    private long mobileNumber;

    @Column(length = 40,unique = true)
    private String emailAddress;
}

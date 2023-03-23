package com.employee_info.EmployeeEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee_skill")
@Data
@NoArgsConstructor

public class EmployeeSkillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "employee")
    @ManyToMany(cascade=CascadeType.ALL)
    @Column(unique = true, length = 100, nullable = false)
    private String skillName;


    public EmployeeSkillEntity(String skillName){
        this.skillName = skillName;
    }
}
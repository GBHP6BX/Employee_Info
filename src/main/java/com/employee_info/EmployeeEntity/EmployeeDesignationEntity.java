package com.employee_info.EmployeeEntity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_designation")
@Data
@NoArgsConstructor
public class EmployeeDesignationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( length = 100, nullable = false)
    private String value;


    public EmployeeDesignationEntity(String value){
        this.value = value;
    }

}



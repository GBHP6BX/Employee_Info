package com.employee_info.EmployeeService;

import com.employee_info.EmployeeEntity.Employee;
import com.employee_info.EmployeeEntity.EmployeeSkillEntity;
import com.employee_info.EmployeeRepository.EmployeeSkillRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class EmployeeSkillService {
    @Autowired
    EmployeeSkillRepo employeeSkillRepo;


    public String save(EmployeeSkillEntity employeeSkillEntity) {
        employeeSkillEntity.setSkillName(employeeSkillEntity.getSkillName());
        employeeSkillRepo.save(employeeSkillEntity);
        return "Employee Data Created";
    }
    private EmployeeSkillEntity findBySkillName(String skillNmae) {
        EmployeeSkillEntity skill = employeeSkillRepo.findBySkillName(skillNmae);
        if(Objects.nonNull(skill)){
            return skill;
        }else{
            EmployeeSkillEntity Skills = new EmployeeSkillEntity(skillNmae);
            return employeeSkillRepo.save(Skills);
        }
    }
}

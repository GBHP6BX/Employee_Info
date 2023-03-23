package com.employee_info.EmployeeRepository;

import com.employee_info.EmployeeEntity.EmployeeDesignationEntity;
import com.employee_info.EmployeeEntity.EmployeeSkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeSkillRepo extends JpaRepository<EmployeeSkillEntity,Long> {

    @Query("select empskill from EmployeeSkillEntity empskill where empskill.skillName=?1")
    EmployeeDesignationEntity findBySkillName(String skillName);
}

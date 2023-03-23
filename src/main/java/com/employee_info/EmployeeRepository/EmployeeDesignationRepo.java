package com.employee_info.EmployeeRepository;

import com.employee_info.EmployeeEntity.EmployeeDesignationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeDesignationRepo extends JpaRepository<EmployeeDesignationEntity,Long> {

    @Query("select empDes from EmployeeDesignationEntity empDes where empDes.value=?1")
    EmployeeDesignationEntity findByValue(String value);


}

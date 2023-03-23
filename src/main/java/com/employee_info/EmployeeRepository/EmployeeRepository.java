package com.employee_info.EmployeeRepository;

import com.employee_info.EmployeeEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}

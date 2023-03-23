package com.employee_info.EmployeeService;


import com.employee_info.EmployeeEntity.Employee;
import com.employee_info.EmployeeEntity.EmployeeDesignationEntity;
import com.employee_info.EmployeeEntity.EmployeeSkillEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EmployeeService {

     String save(Employee employee);

      List<Employee> getAllEmployees();

      void deleteById(Long id);

    String UpdateEmployee(Employee employee);

    String findBySkillName(EmployeeSkillEntity employeeSkillEntity);

    String save(EmployeeSkillEntity employeeSkillEntity);
}

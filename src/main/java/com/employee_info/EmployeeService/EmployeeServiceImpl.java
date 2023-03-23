package com.employee_info.EmployeeService;


import com.employee_info.EmployeeEntity.Employee;
import com.employee_info.EmployeeEntity.EmployeeDesignationEntity;
import com.employee_info.EmployeeEntity.EmployeeSkillEntity;
import com.employee_info.EmployeeRepository.EmployeeDesignationRepo;
import com.employee_info.EmployeeRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeDesignationRepo employeeDesignationRepo;

    @Override
    public String save(Employee employee) {
        employee.setDesignation(getDesignation(employee.getDesignation().getValue()));
        employeeRepository.save(employee);
        return "Employee Data Created";
    }

    private EmployeeDesignationEntity getDesignation(String value) {
        EmployeeDesignationEntity designation = employeeDesignationRepo.findByValue(value);
        if(Objects.nonNull(designation)){
            return designation;
        }else{
            EmployeeDesignationEntity designationRole = new EmployeeDesignationEntity(value);
            return employeeDesignationRepo.save(designationRole);
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        if (employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);

        }
    }
    @Override
    public String UpdateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee Data updated";
    }

    @Override
    public String findBySkillName(EmployeeSkillEntity employeeSkillEntity) {
        return null;
    }
}

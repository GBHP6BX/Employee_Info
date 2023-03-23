package com.employee_info.EmployeeController;

import com.employee_info.EmployeeEntity.Employee;
import com.employee_info.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee_info")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save/employee")
    public String createEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @DeleteMapping("delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteById(id);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee){
        return employeeService.UpdateEmployee(employee);
    }
}

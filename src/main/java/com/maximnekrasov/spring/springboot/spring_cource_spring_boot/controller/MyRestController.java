package com.maximnekrasov.spring.springboot.spring_cource_spring_boot.controller;



import com.maximnekrasov.spring.springboot.spring_cource_spring_boot.entity.Employee;
import com.maximnekrasov.spring.springboot.spring_cource_spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;

    }

//
//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//        }
//
//
//        return employee;
//
//
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//
//        Employee employee = employeeService.getEmployee(id);
//
//employeeService.deleteEmployee(id);
//return "Employee with Id =  " + id  + " was deleted";
//    }
}
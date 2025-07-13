@RestController
@RequestMapping("/api/employees")
package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.example.model.Employee;
import com.example.service.EmployeeService;

public class EmployeeController {

    @Autowired
    private ApplicationContext context;

    @GetMapping
    public List<Employee> getEmployees() {
        return (List<Employee>) context.getBean("employeeList");
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        List<Employee> employees = (List<Employee>) context.getBean("employeeList");
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }
}

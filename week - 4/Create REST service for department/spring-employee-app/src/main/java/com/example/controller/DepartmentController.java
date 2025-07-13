package com.example.controller;

import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<String> getAllDepartments() {
        System.out.println("Fetching all departments...");
        return departmentService.getAllDepartments();
    }
}

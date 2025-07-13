package com.example;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        List<Employee> employees = dao.getAllEmployees();

        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Permanent: " + emp.isPermanent());
            System.out.println("Department: " + emp.getDepartment().getName());
            System.out.print("Skills: ");
            emp.getSkills().forEach(skill -> System.out.print(skill.getName() + " "));
            System.out.println("\n------------------------");
        }
    }
}

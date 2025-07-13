package com.example.dao;
import org.springframework.beans.factory.annotation.Qualifier;

@Repository
public class DepartmentDao {

    private static List<String> DEPARTMENT_LIST;

    private final List<String> departmentList;

    public DepartmentDao(@Qualifier("departmentList") List<String> departmentList) {
        this.departmentList = departmentList;
    }

    @PostConstruct
    public void init() {
        DEPARTMENT_LIST = departmentList;
    }

    public List<String> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}


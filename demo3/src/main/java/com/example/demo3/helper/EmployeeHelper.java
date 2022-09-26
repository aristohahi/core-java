package com.example.demo3.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo3.dao.EmployeeRepository;
import com.example.demo3.model.Employee;


@Component
public class EmployeeHelper {


    private EmployeeRepository repo;

    public Employee getEmployeeById(int id) {
        return repo.getById(id);
    }

    @Autowired
    public EmployeeHelper(EmployeeRepository repo) {
        this.repo = repo;
    }
}

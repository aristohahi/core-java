package com.example.demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo3.helper.EmployeeHelper;
import com.example.demo3.model.Employee;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeHelper helper;

    public Employee getEmployeeById(int id) {
        return helper.getEmployeeById(id);
    }
}
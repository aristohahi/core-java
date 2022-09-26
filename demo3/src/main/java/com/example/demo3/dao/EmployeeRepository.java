package com.example.demo3.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Object> {

    @Modifying
    @Query("update Employee set name=?1 where empid=?2")
    @Transactional
    int updateEmployee(String name,int id);
}
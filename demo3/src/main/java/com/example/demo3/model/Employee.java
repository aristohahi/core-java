package com.example.demo3.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@Table(name="employee")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO) //主键 自增策略
    private int empid;
    private String name;
    public Employee(){}

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.example.demo3.controller;

import com.example.demo3.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo3.model.Employee;
import com.example.demo3.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;
    @Autowired
    private EmployeeRepository dao;

//
//    @RequestMapping(value="/all", method=RequestMethod.GET)
//    public List<Employee> getEmployees(){
//        return dao.getAllEmployees();
//    }


    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        //getById是jpa 自带方法
        return dao.getById(id);
    }
    @RequestMapping(value="/all", method=RequestMethod.GET)
    public List<Employee> getEmployees(){
        //findAll是jpa 自带方法
        return dao.findAll();
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp){
        dao.updateEmployee(temp.getName(), id);
    }

    @PostMapping("/new")
    public void updateEmployee(@RequestBody Employee temp){
        dao.save(temp);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        //deleteById也是自带，这种删除是物理删除，逻辑删除要使用修改的方法
        dao.deleteById(id);
    }

//    @ExpectionHandler(Expection.class)
//    public void handleException() {
//        sout...
//    }

    /*public EmployeeService getService() {
        return service;
    }
    @Autowired
    public void setService(EmployeeService service) {
        this.service = service;
    }*/
}



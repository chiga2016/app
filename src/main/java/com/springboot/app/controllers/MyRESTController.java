package com.springboot.app.controllers;

import com.springboot.app.entity.Employee;
import com.udemy.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmployes(){
        System.out.println("showAllEmployes");
        return employeeService.getAllEmpl();
    }

//    @GetMapping("/employees/{id}")
//    public Employee showEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);
//        if(employee==null){
//            throw new NoSuchEmployeeException("Нет сотрудника с таким ИД");
//        }
//        return employee;
//    }
//
//
//
//    @PostMapping("employees")
//    public Employee addEmployee(@RequestBody Employee employee){
//         employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("employees")
//    public Employee updateEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);
//        if(employee==null){
//            throw new NoSuchEmployeeException("Нет сотрудника с таким ИД");
//        }
//        employeeService.deleteEmployee(id);
//            return "employee with id=" + id + "was deleted";
//
//    }
}

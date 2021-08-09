package com.springboot.app.service;

import com.springboot.app.dao.EmployeeDao;
import com.springboot.app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class EmployeeServiceImpl implements com.udemy.spring.rest.service.EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> getAllEmpl() {
        return employeeDao.getAllEmployees();
    }

//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDao.saveEmployee( employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//       return employeeDao.getEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDao.deleteEmployee(id);
//    }
}

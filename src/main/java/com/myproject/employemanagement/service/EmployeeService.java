package com.myproject.employemanagement.service;

import com.myproject.employemanagement.entity.Employee;
import com.myproject.employemanagement.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public void register(Employee employee) {
        employeeDAO.save(employee);
    }
}

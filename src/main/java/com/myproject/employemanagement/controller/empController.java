package com.myproject.employemanagement.controller;

import com.myproject.employemanagement.entity.Employee;
import com.myproject.employemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class empController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public String home() {
        return "index";
    }

    @GetMapping("/add_emp")
    public String addEmpForm() {
        return "add_emp";
    }

    @PostMapping("register")
    public String registerEmployee(@ModelAttribute Employee employee) {
        employeeService.register(employee);
        return "add_emp";
    }
}

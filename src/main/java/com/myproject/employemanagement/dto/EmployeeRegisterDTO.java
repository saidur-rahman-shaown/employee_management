package com.myproject.employemanagement.dto;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRegisterDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double salary;

    public EmployeeRegisterDTO() {
    }

    public EmployeeRegisterDTO(String firstName, String lastName, String email, String phoneNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

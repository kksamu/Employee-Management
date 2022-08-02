package com.skkworld.EmployeeService.EmployeeService;

import com.skkworld.EmployeeService.Models.Employee;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee viewEmployeeDetails(Long employeeId);
}

package com.skkworld.EmployeeService.EmployeeService;

import com.skkworld.EmployeeService.EmployeeRepository.EmployeeRepository;
import com.skkworld.EmployeeService.Exceptions.EmployeeNotFoundExecption;
import com.skkworld.EmployeeService.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        Employee savedEmployee=employeeRepository.save(employee);
        return savedEmployee;
    }
    public Employee viewEmployeeDetails(Long employeeId){
        Employee employee= employeeRepository.findById(employeeId).orElseThrow(()->
                new EmployeeNotFoundExecption("Invalid Employee"));
        return  employee;
    }
}

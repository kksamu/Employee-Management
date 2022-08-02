package com.skkworld.EmployeeService.EmployeeController;

import com.skkworld.EmployeeService.EmployeeService.EmployeeService;
import com.skkworld.EmployeeService.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "employee-service/v1/")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "add-employee" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addEmployee(@RequestBody Employee employee){
        return new ResponseEntity(employeeService.addEmployee(employee),HttpStatus.CREATED);
    }

    @GetMapping(value = "/get/{employee-id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity viewEmployee(@PathVariable(name = "employee-id") Long employeeId ){
            return new ResponseEntity(employeeService.viewEmployeeDetails(employeeId),HttpStatus.FOUND);
    }


}

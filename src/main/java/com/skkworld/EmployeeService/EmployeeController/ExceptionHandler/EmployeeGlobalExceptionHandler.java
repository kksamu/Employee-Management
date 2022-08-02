package com.skkworld.EmployeeService.EmployeeController.ExceptionHandler;

import com.skkworld.EmployeeService.Exceptions.EmployeeNotFoundExecption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeGlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundExecption.class)
    public ResponseEntity employeeNotFound(EmployeeNotFoundExecption employeeNotFoundExecption){
        return new ResponseEntity(employeeNotFoundExecption.getMessage(), HttpStatus.NOT_FOUND);

    }
}

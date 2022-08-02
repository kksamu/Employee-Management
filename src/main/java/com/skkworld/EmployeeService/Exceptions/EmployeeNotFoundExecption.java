package com.skkworld.EmployeeService.Exceptions;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class EmployeeNotFoundExecption extends RuntimeException{
    private String message;

}

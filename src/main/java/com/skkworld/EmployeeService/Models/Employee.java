package com.skkworld.EmployeeService.Models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long employeeId;
    String firstName;
    String lastName;
    Integer age;
}

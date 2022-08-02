package com.skkworld.EmployeeService.EmployeeRepository;

import com.skkworld.EmployeeService.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

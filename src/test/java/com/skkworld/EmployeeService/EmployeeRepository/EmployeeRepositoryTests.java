package com.skkworld.EmployeeService.EmployeeRepository;

import com.skkworld.EmployeeService.Models.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class EmployeeRepositoryTests {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeRepositoryTests(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Test
    public void  givingEmployeeObject_whenSavingEntity_thenProvidingSavedEmployeeObjet(){
        //giving Employee object as input
        Employee employee= Employee.builder()
                .firstName("Samu")
                .lastName("kk")
                .age(24).build();
        //action on it
        Employee savedEmployee=employeeRepository.save(employee);
        Assertions.assertThat(savedEmployee).isNotNull();
        Assertions.assertThat(savedEmployee.getEmployeeId()).isGreaterThan(0);
    }
}

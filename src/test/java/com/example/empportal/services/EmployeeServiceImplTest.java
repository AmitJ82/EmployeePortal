package com.example.empportal.services;

import com.example.empportal.EmployeeRepository;
import com.example.empportal.dtos.EmployeeDTO;
import com.example.empportal.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeServiceImplTest {
@Mock
private EmployeeRepository employeeRepository;
@InjectMocks
private EmployeeServiceImpl employeeService;
Logger logger= LoggerFactory.getLogger(EmployeeServiceImplTest.class);

    @Test
    void registerEmployee() {
        EmployeeDTO employeeDTO=new EmployeeDTO(0L,"Amit","Joshi","M",new Date(),"Technology");
    employeeDTO=employeeService.registerEmployee(employeeDTO);
    logger.info("Employee:{}",employeeDTO);
        Assert.assertFalse(employeeDTO.getId().equals(0L));
    }

    @Test
    void employeeList() {
    }
}
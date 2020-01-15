package com.example.empportal.services;

import com.example.empportal.EmployeeRepository;
import com.example.empportal.dtos.EmployeeDTO;
import com.example.empportal.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceImplTest {

private EmployeeRepository employeeRepository;

private EmployeeServiceImpl employeeService;
Logger logger= LoggerFactory.getLogger(EmployeeServiceImplTest.class);

@Before
public void setup(){
    employeeRepository=Mockito.mock(EmployeeRepository.class);
    employeeService=new EmployeeServiceImpl();
    employeeService.setEmployeeRepository(employeeRepository);
    Employee employee=new Employee(1L,"Amit","Joshi","M",new Date(),"Technology");
    EmployeeDTO employeeDTO1=new EmployeeDTO(1L,"Amit","Joshi","M",new Date(),"Technology");
    List<Employee> employeeList= Arrays.asList(new Employee[]
            {new Employee(0L,"Amit","Joshi","M",new Date(),"Technology"),
             new Employee(1L,"Amit","Joshi","M",new Date(),"Technology"),
             new Employee(2L,"Amit","Joshi","M",new Date(),"Technology")});

    Mockito.when(employeeRepository.save(ArgumentMatchers.any())).thenReturn(employee);
    Mockito.when(employeeRepository.findAllByOrderByFirstNameAsc()).thenReturn(employeeList);
}
    @Test
    public void registerEmployeeSuccess() {
        EmployeeDTO employeeDTO=new EmployeeDTO(0L,"Amit","Joshi","M",new Date(),"Technology");
        employeeDTO=employeeService.registerEmployee(employeeDTO);
         logger.info("Employee:{}",employeeDTO);
        Assert.assertFalse(employeeDTO.getId().equals(0L));
    }

    @Test
    public void employeeListNotNull() {
        /*EmployeeDTO employeeDTO=new EmployeeDTO(0L,"Amit","Joshi","M",new Date(),"Technology");
        employeeDTO=employeeService.registerEmployee(employeeDTO);*/
        logger.info("Employees:{}",employeeService.employeeList());
        Assert.assertNotEquals(null,employeeService.employeeList());
    }
}
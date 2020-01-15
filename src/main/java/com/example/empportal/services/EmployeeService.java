package com.example.empportal.services;

import com.example.empportal.dtos.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDTO registerEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> employeeList();

}

package com.example.empportal.mapper;

import com.example.empportal.entity.Employee;
import com.example.empportal.dtos.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    EmployeeDTO employeeToEmployeeDTO(Employee employee);

    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);
}

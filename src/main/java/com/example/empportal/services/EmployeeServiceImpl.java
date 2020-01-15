package com.example.empportal.services;

import com.example.empportal.entity.Employee;
import com.example.empportal.dtos.EmployeeDTO;
import com.example.empportal.EmployeeRepository;
import com.example.empportal.mapper.EmployeeMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    @Transactional
    public EmployeeDTO registerEmployee(EmployeeDTO employeeDTO){
        EmployeeMapper mapper= Mappers.getMapper(EmployeeMapper.class);
        Employee employee=mapper.employeeDTOToEmployee(employeeDTO);
        employee=employeeRepository.save(employee);
        return  mapper.employeeToEmployeeDTO(employee);
    }
    @Override
    @Transactional
    public List<EmployeeDTO> employeeList(){
        List<EmployeeDTO> employeeDTOS=new ArrayList<>();
        EmployeeMapper mapper= Mappers.getMapper(EmployeeMapper.class);
       System.out.println("employeeRepository.findAllByOrderByFirstNameAsc()"+employeeRepository.findAllByOrderByFirstNameAsc());
        employeeRepository.findAllByOrderByFirstNameAsc().stream().forEach(e->employeeDTOS.add(mapper.employeeToEmployeeDTO(e)));
       return employeeDTOS;
    }
}

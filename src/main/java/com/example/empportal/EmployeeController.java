package com.example.empportal;

import com.example.empportal.dtos.EmployeeDTO;
import com.example.empportal.services.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/registerEmployee")
    EmployeeDTO registerEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeDTO=employeeService.registerEmployee(employeeDTO);

        return employeeDTO;
    }

    @GetMapping("/listEmployees")
    List<EmployeeDTO> listEmployees(){
        return employeeService.employeeList();
    }
}

package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
   @PostMapping("/employee")
    public ResponseEntity<Object> AddEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = employeeService.addEmp(employeeDto);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}

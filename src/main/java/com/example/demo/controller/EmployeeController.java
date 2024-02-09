package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @CrossOrigin(origins = "http://localhost:5173/")
   @PostMapping("/employee")
    public ResponseEntity<Object> AddEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee = employeeService.addEmp(employeeDto);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:5173/")
    @GetMapping("/all/employee")
    public ResponseEntity<Object> findAll(){
       List<Employee> employee = employeeService.findAllEmployee();
       return new ResponseEntity<Object>(employee, HttpStatus.OK);
    }

}

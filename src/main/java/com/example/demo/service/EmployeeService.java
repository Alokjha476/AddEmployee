package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmp(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmpName(employeeDto.getEmpName());
        employee.setEmpDept(employeeDto.getEmpDept());
        employee.setEmpAddress(employeeDto.getEmpAddress());
        employee.setEmpEmail(employeeDto.getEmpEmail());
        employee.setEmpPhone(employeeDto.getEmpPhone());

        return employeeRepo.save(employee);
    }

}

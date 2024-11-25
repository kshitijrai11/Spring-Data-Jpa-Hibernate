package com.jpa.data.mapping.controllers;

import com.jpa.data.mapping.entities.EmployeeEntity;
import com.jpa.data.mapping.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getDepartmentById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeEntity createNewDepartment(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.createNewEmployee(employeeEntity);
    }



}

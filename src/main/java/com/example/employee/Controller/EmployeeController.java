package com.example.employee.Controller;

import com.example.employee.Exception.UserNotFoundException;
import com.example.employee.Modal.Employee;
import com.example.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> findEmployeebyId(@PathVariable String id)
    {
        Employee employee = employeeService.findByID(id).get();

         return new ResponseEntity<Employee>(employee, HttpStatus.FOUND);
    }

    @GetMapping("/")
    public ResponseEntity<String> homePage()
    {
        return new ResponseEntity<String>("Home",HttpStatus.OK);
    }


}

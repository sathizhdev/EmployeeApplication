package com.example.employee.Controller;

import com.example.employee.Exception.UserNotFoundException;
import com.example.employee.Modal.Employee;
import com.example.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    void EmployeeService(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public ResponseEntity<String> homePage()
    {
        return new ResponseEntity<>("Home",HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> findEmployeeById(@PathVariable String id)
    {
        Optional<Employee> employee= employeeService.findByID(id);

        if(!employeeService.isExists(id))
        {
            return new ResponseEntity<>("Employee Not Found", HttpStatus.NOT_FOUND);
        }
        else
           return new ResponseEntity<>(employee.get(), HttpStatus.FOUND);
    }

    @PostMapping("/employee/create")
    public ResponseEntity<?> createNewEmployeeData(@RequestBody Employee employee)
    {
           if(employee.getEmpId() == null)
               return new ResponseEntity<>(employee,HttpStatus.NOT_ACCEPTABLE);

           if(employeeService.isExists(employee.getEmpId()) )
               return new ResponseEntity<>("Employee with " + employee.getEmpId() + " is Already There!",HttpStatus.OK);

           employeeService.SaveEmployee(employee);

           return new ResponseEntity<>(employee,HttpStatus.CREATED);
    }




}

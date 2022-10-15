package com.example.employee.Service;

import com.example.employee.Exception.UserNotFoundException;
import com.example.employee.Modal.Employee;
import com.example.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService  {

    @Autowired
    EmployeeRepository employeeRepository;

    public Optional<Employee> findByID(String id)
    {
        if(!employeeRepository.findById(id).isPresent())
            throw new UserNotFoundException("User WIth " + id + " Not Found");

       return employeeRepository.findById(id);
    }

}

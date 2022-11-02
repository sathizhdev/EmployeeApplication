package com.example.employee.Service;

import com.example.employee.Exception.UserNotFoundException;
import com.example.employee.Modal.Employee;
import com.example.employee.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService  {

    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Optional<Employee> findByID(String id)
    {
      Optional<Employee> employee = employeeRepository.findById(id);

      return employee;
    }

    public void SaveEmployee(Employee employee)
    {
       employeeRepository.save(employee);

    }

    public boolean isExists(String id)
    {
        return employeeRepository.existsById(id);
    }


}

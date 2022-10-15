package com.example.employee.Repository;

import com.example.employee.Modal.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,String> {

    @Override
    Optional<Employee> findById(String s);
}

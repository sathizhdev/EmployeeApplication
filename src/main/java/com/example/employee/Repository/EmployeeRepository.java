package com.example.employee.Repository;

import com.example.employee.Modal.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String> {

    @Override
    Optional<Employee> findById(String id);
}

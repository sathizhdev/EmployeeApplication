package com.example.employee.Repository;

import com.example.employee.Modal.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

    @Override
    Optional<Employee> findById(String id);

    @Override
    <S extends Employee> S save(S entity);

    @Override
    boolean existsById(String s);
    

}

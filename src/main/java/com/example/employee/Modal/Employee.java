package com.example.employee.Modal;


import javax.persistence.*;
;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(unique = true,name = "Employee_ID")
    private String empId;

    private String firstName;
    private String lastName;

    @Column(unique=true)
    private String email;

    private int age;

    public Employee(String empId, String firstName, String lastName, String email, int age) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Employee() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

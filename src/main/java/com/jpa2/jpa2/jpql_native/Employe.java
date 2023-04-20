package com.jpa2.jpa2.jpql_native;

import jakarta.persistence.*;

/*
    Instructions for JPQL and Native SQL Query
        Create an employeeTable table with the following fields: empId, empFirstName, empLastName,
        empSalary, empAge.
        Create an Employee entity having following fields: id, firstName, lastName, salary, age which
        maps to the table columns given in above.
*/

@Entity
@Table(name = "employee_table")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private int id;

    @Column(name = "empFirstName")
    private String firstName;

    @Column(name = "empLastName")
    private String lastName;

    @Column(name = "empAge")
    private int age;

    @Column(name = "empSalary")
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", Salary=" + salary +
                '}';
    }
}
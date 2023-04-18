package com.jpa2.jpa2;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmpRepo extends CrudRepository<Employee,Integer> {

    /*
    JPQL:
     1. Display the first name, last name of all employees having salary greater than average salary ordered in
      ascending by their age and in descending by their salary.
     2. Update salary of all employees by a salary passed as a parameter whose existing salary is less than the
      average salary.
     3. Delete all employees with minimum salary.
    */

    @Query("SELECT firstName,lastName FROM Employee WHERE salary = (select AVG(salary) from Employee)ORDER BY age ASC,salary DESC")
    List<Object[]> findAllEmployee();

    @Modifying
    @Transactional
    @Query("UPDATE Employee SET salary = :increment WHERE salary < :avgSalary")
    void updateEmployeeBySalary(@Param("increment") double increment,@Param("avgSalary") double avgSalary);

    @Query("SELECT AVG(salary) FROM Employee")
    double avgSalary();

    @Modifying
    @Transactional
    @Query("Delete Employee WHERE salary = :minSalary")
    void deleteEmployeeWithMinSalary(@Param("minSalary") double minSalary);

    @Query("SELECT MIN(salary) FROM Employee")
    double minSalary();

    /*
    Native SQL Query:

    1. Display the id, first name, age of all employees where last name ends with "singh"
    2. Delete all employees with age greater than 45(Should be passed as a parameter)
    */

    @Query(value = "SELECT emp_id, emp_first_name, emp_age FROM employee_table WHERE emp_last_name LIKE '%Singh' ",nativeQuery = true)
    List<Object[]> findAllEmployeeLikeNQ();

    @Modifying
    @Transactional
    @Query(value ="Delete from employee_table WHERE emp_age > :x", nativeQuery =true)
    void deleteEmployeeByAge(@Param("x") int age);

    /*
    Inheritance Mapping:

    Implement and demonstrate Single Table strategy.
    Implement and demonstrate Joined strategy.
    Implement and demonstrate Table Per Class strategy.
    */


    /*
    Component Mapping:

    Implement and demonstrate Embedded mapping using employee table having following fields: id, firstName,
    lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
     */

}

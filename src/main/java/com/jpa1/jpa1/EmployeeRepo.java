package com.jpa1.jpa1;
import com.jpa1.jpa1.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>, PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String name);
    List<Employee> findByAgeBetween(int a1, int a2);

}

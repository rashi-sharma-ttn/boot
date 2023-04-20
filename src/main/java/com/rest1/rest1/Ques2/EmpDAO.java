package com.rest1.rest1.Ques2;


import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmpDAO {
    static int count=0;

    private static List<Employee> user=new ArrayList<>();
    static{
        user.add(new Employee(++count,"Rashi",21));
        user.add(new Employee(++count,"Mansi",22));
        user.add(new Employee(++count,"Manmeet",23));
    }

    public List<Employee>  findAll(){
        return user;
    }

    public Employee getEmployeeById(int id){
        return user.stream().filter(emp->emp.getId()==id).findFirst().orElse(null);
    }

    public void deleteEmployeeById(int id){
        user.removeIf(emp->emp.getId()==id);
    }

    public Employee save(Employee emp){
        emp.setId(++count);
        user.add(emp);
        return emp;
    }
}
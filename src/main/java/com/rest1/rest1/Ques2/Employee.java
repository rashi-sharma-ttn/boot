package com.rest1.rest1.Ques2;


public class Employee {
    private Integer id;
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(Integer id, String name, Integer age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

}

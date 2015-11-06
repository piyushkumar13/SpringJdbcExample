package com.practice.assignments;

public class Employee {
    private int id;
    private String name;
    private String salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String toString() {
        return "id =" + id + "name=" + name + "salary=" + salary;


    }
}

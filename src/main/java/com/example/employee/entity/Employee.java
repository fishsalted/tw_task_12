package com.example.employee.entity;

public class Employee {

    int id;
    String name;
    int age;
    String gender;
    int companyId;
    int salary;

    public Employee(int id,String name, int age, String gender, int companyId, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getSalary() {
        return salary;
    }
}

package com.bridgelabz.payroll.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_payroll")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String salary;
    public Employee(){}
    Employee(String name,String salary){
        //   this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void setid(Long id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setSalary(String salary){
        this.salary=salary;
    }
    public Long  getId(){
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getSalary(){
        return salary;
    }


}
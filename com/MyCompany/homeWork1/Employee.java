package com.MyCompany.homeWork1;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id,String firstName,String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId(){
            return id;
    }

    public String getFirstName(){
            return firstName;
    }

    public String getLastName(){
            return lastName;
    }

    public String getName(){
        return firstName+" "+lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
            return salary*12;
    }

    public  int raiseSalary(int percent){
    double temp=1+((double)percent/100);
    return (int)(salary*temp);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName,this.id,this.lastName,this.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Employee employee=(Employee)obj;

        return this.salary==employee.salary && this.lastName==employee.lastName && this.firstName==employee.firstName
                && this.id==employee.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + firstName +" "+ lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

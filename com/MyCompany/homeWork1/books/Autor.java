package com.MyCompany.homeWork1.books;

import java.util.Objects;

public class Autor
{
    private String name;
    private String email="";
    private  char gender;


    public Autor(String name,char gender){
        this.name=name;
        this.gender=gender;
    }

    public Autor(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName(){
        return name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.email,this.gender,this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if ( obj.getClass() != this.getClass()) {
            return false;
        }
        Autor autor=(Autor) obj;
        return this.gender==autor.gender && this.name==autor.name && this.email==autor.email;


    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

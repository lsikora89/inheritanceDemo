package com.company;

public class Person {

    private String name;

    public Person(String give_name){
        this.name = give_name;
    }

    public void takeMedicine(){
        System.out.println("Yuck that medicine taste bad");
    }

    public void get_operated_on(){
        System.out.println("Your being cut open");
    }
}

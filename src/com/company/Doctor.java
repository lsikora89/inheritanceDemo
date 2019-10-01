package com.company;

public class Doctor {
    protected String AlmaMater;
    private double fee;

    public Doctor(String university, double price){
        AlmaMater = university;
        fee = price;
    }

    public void treatPatient(Person patient){
        System.out.println("Take two every twelve hours");

    }
    public double billPatient(Person patient){
        return fee;
    }
    public double billPatient(boolean medicarePatient, GovermntalProgram govProgram){
        return fee;
    }

}

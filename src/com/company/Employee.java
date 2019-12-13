package com.company;

public class Employee extends Person implements Info{
    String placeOfWork;

    public Employee(String fio, String dateOfBirth, String placeOfWork) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.placeOfWork = placeOfWork;
    }

    @Override
    public void getInfo() {
        System.out.println(this.fio + ":\n\t" + this.dateOfBirth + "\n\t" + this.placeOfWork);
    }
}

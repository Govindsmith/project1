package com.customer.ms.domain;

public class Customer {
private int id;
private String fristName;
private String lastName;
public Customer(int id, String fristName, String lastName){
    this.id=id;
    this.fristName=fristName;
    this.lastName=lastName;

}
    public Customer(){


    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId(){
        return id;
}

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }
}

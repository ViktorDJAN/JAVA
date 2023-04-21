package org.example.OOP.homework.homework_5;

public class Customer {
    Integer customerID;
    String  name;
    Integer balance;

    @Override
    public String toString() {
        return
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", balance=" + balance
                ;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Customer(Integer customerID, String name, Integer balance) {
        this.customerID = customerID;
        this.name = name;
        this.balance = balance;
    }
}

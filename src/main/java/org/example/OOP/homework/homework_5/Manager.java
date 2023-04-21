package org.example.OOP.homework.homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Manager implements Model {
    private ArrayList<Customer> customers = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);

    }


    @Override
    public String toString() {
        return "" + customers
                ;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void addMoney(ArrayList ar1, Integer custId, Integer plusMoney) {
        for (int i = 0; i < ar1.size(); i++) {
            if ((customers.get(i).customerID.equals(custId))) {
                customers.get(i).balance += plusMoney;
            }
        }
    }

    public void takeMoney(ArrayList ar1, Integer custId, Integer minusMoney) {
        for (int i = 0; i < ar1.size(); i++) {
            if ((customers.get(i).customerID.equals(custId))) {
                customers.get(i).balance -= minusMoney;
            }
        }
    }
}
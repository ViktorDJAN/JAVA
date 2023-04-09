package org.example.OOP.seminar.seminar_1.task_3;

public class Main {
    public static void main(String[] args) {
       Product A = new Product();
       VendingMachine machine = new VendingMachine();;
       machine.addProduct(A);
        System.out.println(A);

    }
}

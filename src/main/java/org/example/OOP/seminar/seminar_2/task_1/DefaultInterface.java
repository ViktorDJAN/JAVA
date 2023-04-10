package org.example.OOP.seminar.seminar_2.task_1;

public interface DefaultInterface {
    void printBankAccount();
    default void getUserName(){
        System.out.println("default behavior");
    }
}

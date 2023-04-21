package org.example.OOP.homework.homework_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Реализовать систему работы банковского приложения.
 * - Создать класс пользователь и соответсвующие классы
 * - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
 * - Реализовать функции добавления и удаления пользователя
 */

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        ArrayList arrayList = new ArrayList<>();
        Customer c1 = new Customer(1,"a",200);
        Customer c2 = new Customer(2,"a",200);
        Customer c3 = new Customer(3,"a",200);
        Integer numID = 1;
        Integer plusMoney = 10000;
        Integer minusMoney = 390;
        manager.addCustomer(c1);
        manager.addCustomer(c2);
        manager.addCustomer(c3);
        arrayList.add(c1);
        arrayList.add(c2);
        manager.deleteCustomer(c3);
        System.out.println(manager);
        manager.addMoney(arrayList,numID,plusMoney);
        System.out.println(manager);
        manager.takeMoney(arrayList,numID,minusMoney);
        System.out.println(manager);

    }
}

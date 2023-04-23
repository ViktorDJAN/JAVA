package org.example.OOP.homework.homework_4.task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("max","stone",28,"math");
        Teacher teacher2 = new Teacher("jax","mtone",25,"english");
        Teacher teacher3 = new Teacher("hax","rtone",24,"biology");
        Teacher teacher4 = new Teacher("rax","ktone",26,"chemistry");
        ArrayList<Teacher> total = new ArrayList<>();
        total.add(teacher1);
        total.add(teacher2);
        total.add(teacher3);
        total.add(teacher4);
        TeachersArray teachersArray = new TeachersArray();
        PrintResult printResult = new PrintResult();
        teachersArray.addNewTeacherToArr(teacher1);
        printResult.resultPrint(total); // добавил класс PrintResult для вывода.


    }
}

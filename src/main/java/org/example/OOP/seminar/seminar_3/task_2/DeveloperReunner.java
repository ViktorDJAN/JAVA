package org.example.OOP.seminar.seminar_3.task_2;

public class DeveloperReunner {
    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "Hibernate", "Maven"};
        JavaDevoleper javaDevoleper = new JavaDevoleper("Viktor", skills);
        Iterator iterator = javaDevoleper.getIterator();
        System.out.println("devoloper "+ javaDevoleper.getName());
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}

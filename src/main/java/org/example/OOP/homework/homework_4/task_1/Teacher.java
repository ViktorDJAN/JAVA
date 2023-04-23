package org.example.OOP.homework.homework_4.task_1;

public class Teacher {
    private String firsName;
    private String lastName;
    private Integer age;
    private  String techSubject;

    public Teacher(String firsName, String lastName, Integer age, String techSubject) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.techSubject = techSubject;
    }

    @Override
    public String toString() {
        return
                "firsName ='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", techSubject='" + techSubject + '\''
                ;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTechSubject() {
        return techSubject;
    }

    public void setTechSubject(String techSubject) {
        this.techSubject = techSubject;
    }
}

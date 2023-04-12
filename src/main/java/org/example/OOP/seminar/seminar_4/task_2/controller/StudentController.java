package org.example.OOP.seminar.seminar_4.task_2.controller;



import org.example.OOP.seminar.seminar_4.task_2.data.Student;
import org.example.OOP.seminar.seminar_4.task_2.data.Teacher;
import org.example.OOP.seminar.seminar_4.task_2.service.StudentGroupService;
import org.example.OOP.seminar.seminar_4.task_2.service.StudentService;
import org.example.OOP.seminar.seminar_4.task_2.view.StudentView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {

    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}

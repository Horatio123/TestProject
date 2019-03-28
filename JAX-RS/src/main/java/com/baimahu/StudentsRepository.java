package com.baimahu;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {
    List<Student> students;
    public StudentsRepository(){
        students = new ArrayList<>();

        Student student1 = new Student();
        student1.setName("Alex");
        student1.setId(1);

        Student student2 = new Student();
        student2.setName("Alexander");
        student2.setId(2);

        students.add(student1);
        students.add(student2);
    }

    public List<Student> getStudents(){
        return students;
    }
}

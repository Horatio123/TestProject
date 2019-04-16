package com.baimahu.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorCustom {
    public static void main(String[] args) {
        Student student1 = new Student(1, 67);
        Student student2 = new Student(2, 22);
        Student student3 = new Student(3, 99);
        Student student4 = new Student(4, 60);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students, (s1, s2) -> {
            return s1.getMark() > s2.getMark()? 1:s1.getMark() == s2.getMark()?0:-1;
            //return Integer.compare(s1.getMark(), s2.getMark());
        });

        students.forEach(System.out::println);
        System.out.println();

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 10000));
        employees.add(new Employee(2, 15000));
        employees.add(new Employee(3, 9000));

        Collections.sort(employees);
        employees.forEach(System.out::println);
    }

}
class Student {
    private int no;
    private int mark;

    public Student(int no, int mark) {
        this.no = no;
        this.mark = mark;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", mark=" + mark +
                '}';
    }
}

class Employee implements Comparable<Employee>{
    private int no;
    private int salary;

    public Employee(int no, int salary) {
        this.no = no;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary<o.getSalary()?1:this.salary==o.getSalary()?0:-1;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", salary=" + salary +
                '}';
    }
}

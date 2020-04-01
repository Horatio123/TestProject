package com.baimahu.File;

import com.baimahu.Rest.Student;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectSerializableXML {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("aaaa");

        Student student = new Student();
        student.setId(2);
        student.setName("bbbb");

        try (XMLEncoder xmlEncoder = new XMLEncoder
                (new BufferedOutputStream(new FileOutputStream("school.xml")))) {
            // student should be a public class
            xmlEncoder.writeObject(student);
            // xmlEncoder.writeObject(employee);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(ObjectSerializableXML.class.getName()).log(Level.SEVERE, "error", e);
        }

        try (XMLDecoder xmlDecoder = new XMLDecoder
                (new BufferedInputStream(new FileInputStream("school.xml")))){
            Student student1 = (Student)xmlDecoder.readObject();
            System.out.println(student1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

 class Employee implements Serializable{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

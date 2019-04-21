package com.baimahu.JDBCDemo;

import java.sql.*;

public class DaoDemo {
    public static void main(String[] args) throws Exception {
        StudentDao dao = new StudentDao();
        dao.connect();
        Student stu = dao.getStudent(2);
        System.out.println(stu);

        Student stu2 = new Student(8,"Susan");
        dao.addStudent(stu2);

        Student stu3 = dao.getStudent(8);
        System.out.println(stu3);

        dao.deleteStudent(8);

    }
}
class StudentDao {
    Connection conn = null;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testSQL";
            String user = "root";
            String passwd = "root";
            conn = DriverManager.getConnection(url, user, passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Student getStudent(int id) throws  Exception{
        String query = "select * from student where id=" + id;
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        Student student = new Student(resultSet.getInt(1), resultSet.getString(2));
        return student;
    }

    public int addStudent(Student student) throws Exception {
        String query = "insert into student values(?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, student.getId());
        ps.setString(2, student.getName());
        int count = ps.executeUpdate();
        return count;
    }

    public void deleteStudent(int id) throws Exception {
        String query = "delete from student where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
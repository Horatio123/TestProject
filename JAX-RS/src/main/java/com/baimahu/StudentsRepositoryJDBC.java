package com.baimahu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsRepositoryJDBC {
    String url = "jdbc:mysql://localhost:3306/testSQL";
    String user = "root";
    String passwd = "root";
    Connection conn = null;

    public StudentsRepositoryJDBC() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents(){
        String sql = "select * from student";
        List<Student> ls = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                ls.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ls;
    }

    public Student getStudent(int id) {
        String url = "select * from student where id =" + id;
        Student student = new Student();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(url);
            if (rs.next()) {
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public void createStudent(Student student) {
        String url = "insert into student values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(url);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student) {
        String url = "update student set name = ? where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(url);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void killStudent(int id) {
        String url = "delete from student where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(url);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

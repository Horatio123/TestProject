package com.baimahu.JDBCDemo;
// 1:load package
import java.sql.*;

// DDL(data definition language) DML(data modify language) DQL(fetch data) TCL(transaction control language)
public class JDBCDemo {
    public static void main(String[] args) throws Exception{
        // 2:load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testSQL";
        String user = "root";
        String passwd = "root";
        String query = "select * from student";
        // 3:create connection
        Connection connection = DriverManager.getConnection(url, user, passwd);
        // 4:create statement
        Statement statement = connection.createStatement();

//        String insert = "insert into student values(5, 'Allen')";
//        int count = statement.executeUpdate(insert);
//        System.out.println(count);

//        String insertion = "insert into student values(?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(insertion);
//        preparedStatement.setInt(1, 6);
//        preparedStatement.setString(2, "Bob");
//        preparedStatement.executeUpdate();

        // 5:execute query
        ResultSet resultSet = statement.executeQuery(query);
        // 6:get result
        String userData = "";
        while (resultSet.next()) {
            userData = resultSet.getInt(1) + " " + resultSet.getString(2);
            System.out.println(userData);
        }

        // 7:close statement and connection
        statement.close();
        connection.close();
    }
}

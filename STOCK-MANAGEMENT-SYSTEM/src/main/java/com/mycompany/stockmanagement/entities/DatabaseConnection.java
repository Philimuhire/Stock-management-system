package com.mycompany.stockmanagement.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/stock-management";
        String user = "root";
        String password = "Phili*#123";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            String query = "Insert into customer(customerID,name, contact) values(4,'GRACE','0732073889')";
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Print the stack trace to the console
        }
    }
}



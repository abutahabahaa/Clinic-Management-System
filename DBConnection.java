package db;

import java.sql.*;

public class DBConnection {
    public static Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/clinicsystemjava"; // اسم قاعدة البيانات
        String user = "root";
        String password = ""; // لا يوجد لي كلمة مرور لتسجيل الدخول في mysql 

        return DriverManager.getConnection(url, user, password);
    }
}

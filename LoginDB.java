package auth;

import db.DBConnection;

import java.sql.*;
import java.util.Scanner;

public class LoginDB {
    public static boolean login(String username, String password) {
        try (Connection conn = DBConnection.connect()) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("✅ Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("❌ Invalid username or password.");
        }
    }
}

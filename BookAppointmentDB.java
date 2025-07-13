package appointments;

import db.DBConnection;

import java.sql.*;
import java.util.Scanner;

public class BookAppointmentDB {
    public static boolean isAvailable(String doctor, String date, String time) {
        try (Connection conn = DBConnection.connect()) {
            String query = "SELECT * FROM appointments WHERE doctor_name=? AND appointment_date=? AND appointment_time=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, doctor);
            stmt.setString(2, date);
            stmt.setString(3, time);
            ResultSet rs = stmt.executeQuery();
            return !rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void book(String doctor, String date, String time) {
        try (Connection conn = DBConnection.connect()) {
            String insert = "INSERT INTO appointments (doctor_name, appointment_date, appointment_time) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insert);
            stmt.setString(1, doctor);
            stmt.setString(2, date);
            stmt.setString(3, time);
            stmt.executeUpdate();
            System.out.println("✅ Appointment booked successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doctor: ");
        String doctor = scanner.nextLine();

        System.out.print("Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Time (HH:MM:SS): ");
        String time = scanner.nextLine();

        if (isAvailable(doctor, date, time)) {
            book(doctor, date, time);
        } else {
            System.out.println("⚠️ This slot is already booked.");
        }
    }
}

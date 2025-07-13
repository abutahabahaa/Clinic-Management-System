package appointments;

import db.DBConnection;

import java.sql.*;

public class ViewAppointments {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.connect()) {
            String query = "SELECT * FROM appointments ORDER BY appointment_date, appointment_time";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("📅 قائمة المواعيد المحجوزة:");
            System.out.println("-------------------------------------------------------");
            System.out.printf("%-5s %-20s %-12s %-10s\n", "ID", "Doctor", "Date", "Time");
            System.out.println("-------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String doctor = rs.getString("doctor_name");
                Date date = rs.getDate("appointment_date");
                Time time = rs.getTime("appointment_time");

                System.out.printf("%-5d %-20s %-12s %-10s\n", id, doctor, date, time);
            }

            System.out.println("-------------------------------------------------------");

        } catch (SQLException e) {
            System.out.println("❌ Error retrieving appointments:");
            e.printStackTrace();
        }
    }
}

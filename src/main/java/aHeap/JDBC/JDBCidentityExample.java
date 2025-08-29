package aHeap.JDBC;

import java.sql.*;

public class JDBCidentityExample {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Пример для MySQL
        String user = "root";
        String password = "password";

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // Устанавливаем параметры
            pstmt.setString(1, "Иван Иванов");
            pstmt.setString(2, "ivan@example.com");

            // Выполняем вставку
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                // Получаем сгенерированный ключ (например, ID)
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        long generatedId = generatedKeys.getLong(1);
                        System.out.println("Сгенерированный ID: " + generatedId);
                    } else {
                        System.out.println("Не удалось получить сгенерированный ключ.");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

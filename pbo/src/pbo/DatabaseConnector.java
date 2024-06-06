package pbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection connect() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/pbo_minimarket_proyek";
        String dbUser = "admin";
        String dbPassword = "admin123";

        return DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
    }
}

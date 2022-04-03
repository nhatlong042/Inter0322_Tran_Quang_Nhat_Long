package reposity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseReposity {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/khu_nghi_duong";
    private String username = "root";
    private String password = "codegym";
    private Connection connection;

    public BaseReposity() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}


package otomation_business;

import java.sql.*;

public class DbHelper {
    
    private String username = "root";
    private String password = "1234";
    private String dbUrl = "jdbc:mysql://127.0.0.1:3306/business_otomation";

    public Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(dbUrl, username, password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
    
}

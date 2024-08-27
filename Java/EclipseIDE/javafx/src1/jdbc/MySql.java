package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MySql {

    public static void main(String[] args) {
        // Database URL, username, and password
    	String url = "jdbc:mysql://localhost:3306/jdbc";
    	String user = "root";
    	String password = "vvst007CMR";

        // SQL query
        String query = "SELECT * FROM users";

        // JDBC objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. Establishing a connection to the database
            connection = DriverManager.getConnection(url, user, password);

            // 2. Creating a statement object to execute the query
            statement = connection.createStatement();

            // 3. Executing the query and getting the result set
            resultSet = statement.executeQuery(query);

            // 4. Processing the result set
            while (resultSet.next()) {
            	String pass = resultSet.getString("password");
                String name = resultSet.getString("name");
                System.out.println("Name: " + name + "\nPass: " + pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. Closing resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

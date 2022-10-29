package JDBC_Personal_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Access_Connection_JDBC {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "thread";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot Establish Connection :( ");
        }

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        System.out.println("Connection Established :) ");

        connection.close();

    }
}

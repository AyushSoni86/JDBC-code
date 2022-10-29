package JDBC_Personal_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_02_Insert_Table {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","thread");

        Statement statement = connection.createStatement();

        String insert_data = "insert into personal values (6,'Vaibhavi','2001-12-09','7755947009','F') " ;

        int rowsUpdated  = statement.executeUpdate(insert_data);

        System.out.println(rowsUpdated + "\t" + "inserted successfully :) ");

        connection.close();

    }
}

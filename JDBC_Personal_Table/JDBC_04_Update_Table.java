package JDBC_Personal_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_04_Update_Table {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","thread");

        Statement statement = connection.createStatement();

        String update_row = " update personal set name = 'Chiraj' where id = 5" ;

        int rowsUpdated  = statement.executeUpdate(update_row);

        System.out.println(rowsUpdated + "\t" + "updated successfully :) ");

        connection.close();

    }
}

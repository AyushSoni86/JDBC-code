package JDBC_Personal_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_03_Delete_Table {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","thread");

        Statement statement = connection.createStatement();

        String delete_row = "delete from personal where id = 4 " ;

        int rowsUpdated  = statement.executeUpdate(delete_row);

        System.out.println(rowsUpdated + "\t" + "deleted successfully :) ");

        connection.close();

    }
}

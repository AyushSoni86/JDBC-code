package JDBC_Hydraguru_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_00ConnecrtionEstablishing

{

    public static void main(String[] args) throws ClassNotFoundException, SQLException

    {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","thread");

        Statement statement = connection.createStatement();

        System.out.println("Connection Established :) ");

        connection.close();

    }

}

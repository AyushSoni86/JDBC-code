package JDBC_Personal_Table;

import java.sql.*;
import java.util.Stack;

public class JDBC_01_Access_Table {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","thread");

        Statement statement = connection.createStatement();

        String accessTable = "SELECT * FROM personal";

        ResultSet resultSet = statement.executeQuery(accessTable);

        while (resultSet.next() ){
            System.out.println( resultSet.getInt(1) +   "\t"  +   "\t"+"\t"
                             + resultSet.getString(2)  +"\t"  +   "\t" +"\t"
                             + resultSet.getString(3)  +"\t"  +   "\t"+"\t"
                             + resultSet.getString(4)  +"\t"  +   "\t"+"\t"
                             + resultSet.getString(5));
        }

        System.out.println("Connection Established Successfully :) ");

        connection.close();
    }
}

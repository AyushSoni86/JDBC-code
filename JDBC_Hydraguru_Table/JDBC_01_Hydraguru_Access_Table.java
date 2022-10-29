package JDBC_Hydraguru_Table;

import java.sql.*;

public class JDBC_01_Hydraguru_Access_Table {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "thread");

        Statement statement = connection.createStatement();

        String query = "select * from hydraguru";

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next())
        {

            System.out.println(  resultSet.getInt(1) + "\t" + "\t" +
                                 resultSet.getString(2) + "\t" + "\t" +
                                 resultSet.getString(3) + "\t" + "\t" +
                                 resultSet.getString(4) + "\t" + "\t" +
                                 resultSet.getString(5) + "\t" +"\t" +"\t"
                              );
        }

        resultSet.close();

        statement.close();

        connection.close();

    }
}

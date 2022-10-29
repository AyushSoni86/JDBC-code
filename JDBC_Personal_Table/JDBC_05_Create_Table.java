package JDBC_Personal_Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_05_Create_Table {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

         Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","thread");

        Statement statement = connection.createStatement();

        String create_table = "CREATE TABLE hydraGuru (player_id INT , player_name varchar(20) ,  player_level INT, player_clan varchar(20) )";

        int createTable = statement.executeUpdate(create_table);

        System.out.println(createTable);

        connection.close();
    }
}

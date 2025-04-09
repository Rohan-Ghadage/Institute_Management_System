package institute.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Conn {
    public PreparedStatement s;
    public PreparedStatement Statement;
    Connection connection;
    Statement statement;

    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/`instute_management_system`","root","Mysql@143");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public PreparedStatement prepareStatement(String query) {
        return null;
    }
}

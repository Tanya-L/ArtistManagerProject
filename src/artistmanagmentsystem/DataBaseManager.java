package artistmanagmentsystem;

import artistmanagmentsystem.util.SqlStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * @author marie
 */
public class DataBaseManager {
    
    private Connection connection;
    
    final static String url = "jdbc:derby://localhost:1527/ArtistManagmentSystem";
    final static String user = "root";
    final static String password = "root";
    

    public DataBaseManager() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    void addArtist(String name, String lastName, int age) throws SQLException {
        
        PreparedStatement prepareAddStatement = connection.prepareStatement(SqlStatements.ADD_STATMENT);
                
        prepareAddStatement.setString(1, name);
        prepareAddStatement.setString(2, lastName);
        prepareAddStatement.setInt(3, age);

        prepareAddStatement.execute();
        
        prepareAddStatement.close();
    }
}

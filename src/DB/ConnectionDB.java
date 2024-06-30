
package DB;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
public class ConnectionDB {
  
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/hospital_system_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
  
    public Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(JDBC_URL+"?autoReconnect=true&useSSL=false",JDBC_USER,JDBC_PASSWORD);
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: "+e.getMessage());
        }
        return con;
    
}
}

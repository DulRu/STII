
package DBconnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


 
public class dbconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testproject", "root", "");
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        
        
        return conn;
        
    }
    
}

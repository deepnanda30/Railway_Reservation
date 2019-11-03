

package rail2;
import java.sql.*;
import javax.swing.JOptionPane;

public class databaseConnection {
    
    
    public static Connection connection()
    {
        try
        {
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trains", "root", "");
        
        return conn;
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
public static void main(String[] args) throws SQLException
{
    
    Connection conn =null;
    Statement stmt = null;
    ResultSet rs = null;
    conn=databaseConnection.connection();
    stmt=conn.createStatement();
    rs = stmt.executeQuery("select * from trial");
     while (rs.next()) {
                System.out.println(rs.getString("hi"));
            }
}

 
            

            // 4. Process the result set
           

        
   
}





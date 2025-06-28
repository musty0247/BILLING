/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 *
 * @author user
 */
public class mycon {
    
    
    public static Connection getConnection(){
        Connection con=null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/BILLING","root","");
            
            
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(mycon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return con;
    }
    
    
    
}

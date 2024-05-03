/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;
import java.sql.*;
/**
 *
 * @author vbj
 */
public class connectionDB {
    
    public static Connection getConnection(){
        
        try {
            String url = "jdbc:mysql://10.0.0.254:3306/school_vagner";
            String user = "vbj";
            String pass = "Admin12@";
            
            
            
            return DriverManager.getConnection(url, user, pass);

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        

    }
}

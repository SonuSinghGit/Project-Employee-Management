/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management2;
import java.sql.*;
/**
 *
 * @author singh
 */
public class Conn {
    Connection c;
    Statement s;
    
    public Conn()
    {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","C##SONU","AA");  
            s=c.createStatement();
            
        
        }catch(Exception e){
           e.getStackTrace();
        }
    }
}

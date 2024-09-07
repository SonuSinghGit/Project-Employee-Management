/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ViewEmployee  extends JFrame
{
    JTable table;
    public ViewEmployee()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        table=new JTable();
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from employee");
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        
        }
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
    }
    
    
    
    
    public static void main(String args[])
    {
        new ViewEmployee();
    }
    
}

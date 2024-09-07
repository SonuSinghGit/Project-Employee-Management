/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    JLabel lbl1,lbl2;
    JTextField txt1;
    JPasswordField txt2;
    JButton login;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        lbl1=new JLabel("Username");
        lbl1.setBounds(40,20,100,30);
        add(lbl1);
        
        txt1=new JTextField();
        txt1.setBounds(150, 20, 150, 30);
        add(txt1);
        
        lbl2=new JLabel("Password");
        lbl2.setBounds(40,70,100,30);
        add(lbl2);
        
        txt2=new JPasswordField();
        txt2.setBounds(150, 70, 150, 30);
        add(txt2);
        
        login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350, 0,200,200);
        add(image);
        
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }
    public  void actionPerformed(ActionEvent ae)
    {
        try{
            String username =txt1.getText();
            String password =txt2.getText();
            
            Conn c= new Conn();     
            String query="select * from login where username= '"+username+"' and password='"+password+"'";
            
           ResultSet rs= c.s.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new Home();
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Invalid Username Or Password");
               setVisible(false);
           }
  
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String agrs[])
    {
        new Login();
    }
}

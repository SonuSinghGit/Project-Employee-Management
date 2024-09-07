/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddEmployee extends JFrame// implements ActionListener
{
    JLabel labelname,lblempid;
    JTextField tfname,tffname,tfadd,tfphone,tfemail,tfdesignation,tfaadhar,dcdob,tfsalary;
    JComboBox cbeducation;
    JButton add,back;
    
    Random ran=new Random();
    int number =ran.nextInt(999999);
    
    AddEmployee()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading= new JLabel("Add Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        labelname =new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelname);
        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        JLabel labelfname=new JLabel("Father's Name");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelfname);
        tffname=new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        JLabel labeldob=new JLabel("DOB");
        labeldob.setBounds(50,200,150,30);
        labeldob.setFont(new Font("Serif",Font.PLAIN,20));
        add(labeldob);
        dcdob=new JTextField();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);
        
        JLabel labelsalary=new JLabel("Salary");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelsalary);
        tfsalary=new JTextField();
        tfsalary.setBounds(600,200,150,30);
        add(tfsalary);
        
        JLabel labeladd=new JLabel("Address");
        labeladd.setBounds(50,250,150,30);
        labeladd.setFont(new Font("Serif",Font.PLAIN,20));
        add(labeladd);
        tfadd=new JTextField();
        tfadd.setBounds(200,250,150,30);
        add(tfadd);
        
        JLabel labelphone=new JLabel("Phone No");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelphone);
        tfphone=new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        JLabel labelmail=new JLabel("Email");
        labelmail.setBounds(50,300,150,30);
        labelmail.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelmail);
        tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel labeledu=new JLabel("Highest Education");
        labeledu.setBounds(400,300,150,30);
        labeledu.setFont(new Font("Serif",Font.PLAIN,20));
        add(labeledu);
        
        String courses[]={"B.tech","M.tech","MCA","PHD"};
        cbeducation=new JComboBox(courses);
        cbeducation.setBounds(600,300,150,30);
        add(cbeducation);
        
        JLabel labeldesignation=new JLabel("Degignation");
        labeldesignation.setBounds(50,350,150,30);
        labeldesignation.setFont(new Font("Serif",Font.PLAIN,20));
        add(labeldesignation);
        tfdesignation=new JTextField();
        tfdesignation.setBounds(200,350,150,30);
        add(tfdesignation);
        
        JLabel labelaadhar=new JLabel("Aadhar No");
        labelaadhar.setBounds(400,350,150,30);
        labelaadhar.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelaadhar);
        tfaadhar=new JTextField();
        tfaadhar.setBounds(600,350,150,30);
        add(tfaadhar);
        
        JLabel labelempid=new JLabel("Emp ID");
        labelempid.setBounds(50,400,150,30);
        labelempid.setFont(new Font("Serif",Font.PLAIN,20));
        add(labelempid);
        lblempid=new JLabel(""+number);
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("Serif",Font.PLAIN,20));
        add(lblempid);
        
        add =new JButton("Add Details");
        add.setBounds(250,550,150,40);
      //  add.addActionListener(this);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add(add);
        
        back =new JButton("Back");
        back.setBounds(450,550,150,40);
       // back.addActionListener(this);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        add( back);
        
        
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
//    public void actionPerform(ActionEvent ae)
//    {
//        if(ae.getSource()== add)
//        {
//            String name=tfname.getText();
//            String fname=tffname.getText();
//            String dob=dcdob.getText();
//            String salary=tfsalary.getText();
//            String address=tfadd.getText();
//            String phone=tfphone.getText();
//            String email=tfemail.getText();
//            String education=(String)cbeducation.getSelectedItem();
//            String designation=tfdesignation.getText();
//            String aadhar=tfaadhar.getText();
//            String empid=lblempid.getText();
//            
//            try
//            {
//                Conn conn=new Conn();
//                String query="insert into employee values('"+name+"','"+fname+"', '"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empid+"')";
//                
//                conn.s.executeUpdate(query);
//                JOptionPane.showMessageDialog(null,"details added successfully");
//                setVisible(false);
//                new Home();
//            }catch(Exception e)
//            {
//               e.printStackTrace();
//            }
//            
//            }
//            
//        }
//        else
//        {
//            setVisible(false);
//            new Home();
//        }
//    }
    
    public static void main(String args[])
    {
        new AddEmployee();
    }
    
}
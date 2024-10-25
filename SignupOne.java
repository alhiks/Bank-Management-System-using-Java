/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
/**
 *
 * @author Dell
 */
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried,others;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);
        Random ran=new Random();
          random=Math.abs((ran.nextLong()%9000L)+1000L);
      
        
        JLabel formno=new JLabel("Application Form No.:"+random);
       formno.setFont(new Font("Raleway",Font.BOLD,38));
       formno.setBounds(140,20,600,40);
        add(formno);
        
         JLabel personalDetails=new JLabel("Page 1: Personal Details:");
       personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
       personalDetails.setBounds(290,80,700,40);
        add(personalDetails);
        
        JLabel name=new JLabel("Name:");
       name.setFont(new Font("Raleway",Font.BOLD,20));
       name.setBounds(100,140,700,40);
        add(name);
        
        nameTextField=new JTextField();
         nameTextField.setFont(new Font("Raleway",Font.BOLD,18));
         nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
          JLabel fname=new JLabel("Father Name:");
       fname.setFont(new Font("Raleway",Font.BOLD,20));
       fname.setBounds(100,190,700,40);
        add(fname);
        
   fnameTextField=new JTextField();
         fnameTextField.setFont(new Font("Raleway",Font.BOLD,18));
         fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("D.O.B.:");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
       dob.setBounds(100,240,700,40);
        add(dob);
        
     dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
       add(dateChooser);
        
         JLabel gender=new JLabel("Gender:");
      gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100,290,700,40);
        add(gender);
        
       male=new JRadioButton("Male");
        male.setBounds(300,290,60,40);
        male.setBackground(Color.white);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(450,290,120,40);
        female.setBackground(Color.white);
        add(female);
        
      other=new JRadioButton("Others");
        other.setBounds(600,290,180,40);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        
         JLabel email=new JLabel("Email Address:");
       email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100,340,700,40);
        add(email);
        emailTextField=new JTextField();
         emailTextField.setFont(new Font("Raleway",Font.BOLD,18));
         emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
         JLabel marital=new JLabel("Marital Status:");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100,390,700,40);
        add(marital);
        
      married=new JRadioButton("Married");
        married.setBounds(300,390,100,40);
        married.setBackground(Color.white);
        add(married);
       unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,40);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
         others=new JRadioButton("Others");
        others.setBounds(630,390,100,40);
        others.setBackground(Color.white);
        add(others);
        
        ButtonGroup maritalStatus=new ButtonGroup();
        maritalStatus.add(married);
        maritalStatus.add(unmarried);
        maritalStatus.add(others);
        
       
        
         JLabel address=new JLabel("Address:");
       address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100,440,700,40);
        add(address);
        
      addressTextField=new JTextField();
         addressTextField.setFont(new Font("Raleway",Font.BOLD,18));
         addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
         JLabel city=new JLabel("City:");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,490,700,40);
        add(city);
        
        cityTextField=new JTextField();
         cityTextField.setFont(new Font("Raleway",Font.BOLD,18));
         cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
         JLabel state=new JLabel("State:");
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds(100,540,700,40);
        add(state);
        
        stateTextField=new JTextField();
         stateTextField.setFont(new Font("Raleway",Font.BOLD,18));
         stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
           JLabel pincode=new JLabel("Pincode:");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
       pincode.setBounds(100,590,700,40);
        add(pincode);
        
       pincodeTextField=new JTextField();
         pincodeTextField.setFont(new Font("Raleway",Font.BOLD,18));
         pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
          getContentPane().setBackground(Color.WHITE);
          
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno=""+random;
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
       String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();  
        String gender= null;
        if(male.isSelected())
        {
            gender="Male";
          
        }
        else if(female.isSelected())
        {
            gender="Female";
        }
        else 
        {
            gender="Other";
        }
        
        String email =emailTextField.getText();
        String marital=null;
        if(married.isSelected())
        {
            marital="Married";
        }
        else if(unmarried.isSelected())
        {
            marital="Unmarried";
        }
        else if(others.isSelected())
        {
            marital="Others";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pincode=pincodeTextField.getText();
        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
             else
            {
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
           c.s.executeUpdate(query);
           
           setVisible(false);
           new SignupTwo(formno).setVisible(true);
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }
    public static void main(String [] args)
    {
        new SignupOne().setVisible(true);
    }
}

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
public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField pan,aadhar;
    JButton next;
   
    JRadioButton syes,eyes,eno,sno;
    String formno;
    
    JComboBox religion,category,occupation,education,income;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
       setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
      
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
       additionalDetails.setFont(new Font("Raleway",Font.BOLD,38));
       additionalDetails.setBounds(140,20,600,40);
        add(additionalDetails);
        
        
        
        JLabel name=new JLabel("Religion:");
       name.setFont(new Font("Raleway",Font.BOLD,20));
       name.setBounds(100,140,700,40);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
               religion=new JComboBox(valReligion);
                religion.setBounds(300,140,400,30);
                religion.setBackground(Color.white);
        add(religion);
        
      
       
          JLabel fname=new JLabel("Category:");
       fname.setFont(new Font("Raleway",Font.BOLD,20));
       fname.setBounds(100,190,700,40);
        add(fname);
        
         String valCategory[]={"General","OBC","SC","ST","Other"};
     category=new JComboBox(valCategory);
     category.setBounds(300,190,400,30);
      category.setBackground(Color.white);
        add(category);
        
  
        JLabel dob=new JLabel("Income:");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
       dob.setBounds(100,240,700,40);
        add(dob);
        
         String incomeCategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
       income=new JComboBox(incomeCategory);
   income.setBounds(300,240,400,30);
      income.setBackground(Color.white);
        add(income);
        
     
        
         JLabel gender=new JLabel("Educational:");
      gender.setFont(new Font("Raleway",Font.BOLD,20));
         gender.setBounds(100,290,200,30);
        add(gender);
     
        JLabel email=new JLabel("Qualication:");
    email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,40);
        
        add(email);
        
        String educationValues[]={"Non-Graduate","Graduate","Post-Graduation","Doctrate"+"Others"};
 education=new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
     education.setBackground(Color.white);
        add(education);
        
        
        
      
        
        JLabel marital=new JLabel("Occupation:");
      marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100,390,200,40);
        add(marital);
        
           String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
 occupation=new JComboBox(occupationValues);
     occupation.setBounds(300,390,400,30);
   occupation.setBackground(Color.white);
        add(occupation);
          
         JLabel address=new JLabel("Pan No.:");
       address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100,440,700,40);
        add(address);
        
     pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,18));
        pan.setBounds(300,440,400,30);
        add(pan);
        
         JLabel city=new JLabel("Aadhar No.:");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,490,700,40);
        add(city);
        
       aadhar=new JTextField();
         aadhar.setFont(new Font("Raleway",Font.BOLD,18));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
         JLabel state=new JLabel("Senior Citizen:");
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds(100,540,700,40);
        add(state);
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
      
           JLabel pincode=new JLabel("Existing Account:");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
       pincode.setBounds(100,590,700,40);
        add(pincode);
        
         eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup emaritalgroup=new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
       
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
       
        String sreligion=(String) religion.getSelectedItem();
        String scategory=(String) category.getSelectedItem();
       String sincome=(String) income.getSelectedItem();
         String seducation=(String)education.getSelectedItem();
           String soccupation=(String)occupation.getSelectedItem();
             String seniorcitizen=null;
       
    
        if(syes.isSelected())
        {
         seniorcitizen ="Yes";
          
        }
        else if(sno.isSelected())
        {
          seniorcitizen="No";
        }
        
        
      
        String existingAccount=null;
        if(eyes.isSelected())
        {
            existingAccount="Yes";
        }
        else if(eno.isSelected())
        {
            existingAccount="No";
        }
       
        String span=pan.getText();
        String saadhar=aadhar.getText();
       
        try{
         
                Conn c=new Conn();
                 String query= "insert into signuptwo  values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingAccount+"')";
                c.s.executeUpdate(query);
                
                //signup3 class's object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                  
            }
        
        
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }
    public static void main(String [] args)
    {
        new SignupTwo(" ").setVisible(true);
    }
}































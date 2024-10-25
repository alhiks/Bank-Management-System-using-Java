// ### Packages and import statements 
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {// login inherits from jframe and implements login interface
    /// #### GUI Components #####
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
     Login()// login constructor initializes the login object
                {
                    setTitle(" Bank Management System");//  bank management system 
                    setLayout(null);// setting the positioning to null 
                    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));// i1 object retrieves the image located in icons file
                    Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);// get the image at scaled dimensions 
                    ImageIcon i3=new ImageIcon(i2);// this object allows to use rescale image in swing gui
                    JLabel label=new JLabel(i3);
                    label.setBounds(70,10,100,100);
                    add(label);
                    
                    JLabel text=new JLabel("Welcome To Bank");
                    text.setFont(new Font("Osward",Font.BOLD,38));
                    text.setBounds(200,40,700,40);
                    add(text);
                   
                     JLabel cardno=new JLabel("Card No.:");
                    cardno.setFont(new Font("Raleway",Font.BOLD,28));
                    cardno.setBounds(120,150,700,40);
                    add(cardno);
                    
                    cardTextField =new JTextField();
                    cardTextField.setBounds(300,150,230,40);
                    cardTextField.setFont(new Font("Arial",Font.BOLD,14));
                    add(cardTextField);
                    
                     JLabel pin=new JLabel("Password:");
                    pin.setFont(new Font("Raleway",Font.BOLD,28));
                    pin.setBounds(120,220,700,40);
                    add(pin);
                    
                     pinTextField =new JPasswordField();
                    pinTextField.setBounds(300,220,230,40);
                    
                    add(pinTextField);
                    
                    login=new JButton("SIGN IN");
                    login.setBounds(300,300,100,30);
                    login.setBackground(Color.BLUE);
                    login.setForeground(Color.WHITE);
                    login.addActionListener(this);
                   add(login); 
                   
                     clear=new JButton("CLEAR");
                    clear.setBounds(430,300,100,30);
                    clear.setBackground(Color.BLUE);
                    clear.setForeground(Color.WHITE);
                      clear.addActionListener(this);
                   add(clear); 
                   
                   signup=new JButton("SIGN UP");
                    signup.setBounds(300,350,230,30);
                    signup.setBackground(Color.BLUE);
                    signup.setForeground(Color.WHITE);
                      signup.addActionListener(this);
                   add(signup); 
                   
                    
                    getContentPane().setBackground(Color.white);// set frame background color 
                    setSize(800,480);// set frame size
                    setVisible(true);//making frame visible
                    
                    setLocation(350,200);
                }
     public void actionPerformed(ActionEvent ae)// implements actionlistener interface
     {
       // it contains info that if the buttons were clicked or not
       // it check the button clicks by comparing a.getsource() with button objects
         if(ae.getSource()==clear)
         {
             // if user clicks clear then filled data will be emptiied 
             cardTextField.setText("");
              pinTextField.setText("");
             
         }else if(ae.getSource()==login)
         {
             /* Database Connection:
            Conn conn = new Conn();
             creates an instance of a Conn class that likely handles database connections (e.g., using JDBC).
              conn.s.executeQuery(query) runs the SQL query on the database. Here, 
             the query checks whether the card number and pin match any records in the login table.
*/
             Conn conn = new Conn();
             String cardnumber=cardTextField.getText();
             String pinnumber=pinTextField.getText();
             String query="select * from login where cardnumber='"+cardnumber+"' and pin='"+pinnumber+"'";
             try{
               ResultSet rs=  conn.s.executeQuery(query);
               /*  rs.next() checks if the query returned any results (i.e., whether a matching record exists in the database).
                   If it does, the login is successful:
               The current window is hidden (setVisible(false)).
              A new window is opened to show the Transactions screen for the user (passing the pinnumber to it).*/
               if(rs.next())
               {
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               }else
                   /*  If no result is found (i.e., no match), 
                   an error message is shown using JOptionPane.showMessageDialog to inform the user 
                   that the card number or PIN is incorrect.*/
               {
                   JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
               }
             }
             //If there is any error during database access, it is caught and printed to the console.
             catch(Exception e){
                 System.out.println(e);
             }
         }
         else if(ae.getSource()==signup)
         {
            setVisible(false) ;
            new SignupOne().setVisible(true);
         }
     }
    public static void main(String [] args)
    {
       new Login();
    }
}

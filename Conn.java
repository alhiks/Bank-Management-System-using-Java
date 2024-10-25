/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
           // Class.forName(com.mysql.cj.jdbc.Driver); no need for this line
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","shashikala");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

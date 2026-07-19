package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
                        c = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/bankmanagementsystem?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                "root",
                                "Siddhan@123"
                        );
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            e.printStackTrace();
            throw new RuntimeException("Database connection failed", e);
        }  
    }  
}  

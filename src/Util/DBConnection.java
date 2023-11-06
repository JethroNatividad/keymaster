package Util;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jet
 */
public class DBConnection {
    public Connection getConnection(){
        try {
            Driver mySqlDriver = (Driver) DriverManager.getDriver("jdbc:mysql://localhost:8889/");
            Properties prop = new Properties();
            prop.put("user", "root");
            prop.put("password", "root");
            prop.put("useSSL", "false"); // Disable SSL
            Connection con =  (Connection) mySqlDriver.connect("jdbc:mysql://localhost:8889/keymaster", prop);
            System.out.println("Connected to database!");
            return con;
            
        } catch (Exception e) {
            throw new Error(e);
        }
    }
    
}

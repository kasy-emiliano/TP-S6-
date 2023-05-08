package com.example.demo.model;


import java.sql.DriverManager;

/**
 *
 * @author Cedrick
 */
public class Connect {
     public java.sql.Connection con() throws Exception{
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://containers-us-west-180.railway.app:6027/railway","postgres","WpZhHXX7Dl3KMFNqu9fu");
    }
    
}

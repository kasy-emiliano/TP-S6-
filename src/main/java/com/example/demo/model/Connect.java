package com.example.demo.model;


import java.sql.DriverManager;

/**
 *
 * @author Cedrick
 */
public class Connect {
     public java.sql.Connection con() throws Exception{
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/aticle","article","article");
    }
    
}

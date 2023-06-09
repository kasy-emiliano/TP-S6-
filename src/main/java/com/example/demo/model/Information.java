/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.example.demo.generic.Attr;
import com.example.demo.generic.ClassAnotation;
import connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 *
 * @author Cedrick
 */
@ClassAnotation(table = "information")
public class Information {
    @Attr(isPrimary = true)
    int id;
    @Attr
    String titre;
    @Attr
    String body;
    @Attr
    String photo;
    
    String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl() {
        String url= titre+"-"+id;
        url=url.replaceAll("[,\\s\']+", "-");
        setUrl (url);
    }
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

   
    public Information() {
    }

    public Information(String titre, String body, String photo) {
        this.titre = titre;
        this.body = body;
        this.photo = photo;
    }
    
    public void delete(int id) throws Exception {
        Connection connection = null;
        PreparedStatement stat = null;
        try {
            Connexion connect = new Connexion();
            connection = connect.con();
            String query = "delete from information where id= ?";
            stat = connection.prepareStatement(query);
            stat.setObject(1, id);
            stat.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            stat.close();
            connection.close();
        }
    }
    public void update(int id,String titre,String body,String hoto) throws Exception {
        Connection connection = null;
       Statement stat = null;
        try {
            Connexion connect = new Connexion();
            connection = connect.con();
            String query = "update information set titre='"+titre+"',body= '"+body+"',photo='"+photo+"' where id="+id;
            stat = connection.createStatement();
            stat.executeUpdate(query);
        } catch (Exception ex) {
            throw ex;
        } finally {
            stat.close();
            connection.close();
        }
    }

 

    public Information findById(int id) throws Exception {
        Information info = null;
       Connection connection = null;
       Statement stat = null;
        PreparedStatement statement=null;
       
        try{
            Connexion connect = new Connexion();
            connection = connect.con();
            String query = "SELECT * FROM information WHERE id = ?";
            statement = connection.prepareStatement(query); 
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                info = new Information();
                info.setId(resultSet.getInt("id"));
                info.setTitre(resultSet.getString("titre"));
                info.setBody(resultSet.getString("body"));
                info.setPhoto(resultSet.getString("photo"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return info;
    
    // ...
}
   
}
 // ...


    


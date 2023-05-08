/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.example.demo.generic.Attr;
import com.example.demo.generic.ClassAnotation;

/**
 *
 * 
 */
@ClassAnotation(table = "admin")
public class Admin {
    @Attr(isPrimary = true)
    int id;
    @Attr
    String nom;
    @Attr
    String mdp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Admin() {
    }

    public Admin(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
    }
  
}

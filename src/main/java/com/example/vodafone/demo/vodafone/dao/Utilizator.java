package com.example.vodafone.demo.vodafone.dao;

import javax.persistence.*;

@Entity
@Table
public class Utilizator {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column
    private String email;
    
    @Column
    private boolean abonare;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public boolean isAbonare() { return abonare; }

    public void setAbonare(boolean abonare) { this.abonare = abonare; }

}

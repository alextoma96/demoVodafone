package com.example.vodafone.demo.vodafone.dao;

import javax.persistence.*;

@Entity
@Table
public class Subscription {

    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private int id_postare;

    @Column
    private int id_utilizator;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getId_postare() { return id_postare; }

    public void setId_postare(int id_postare) { this.id_postare = id_postare; }

    public int getId_utilizator() { return id_utilizator; }

    public void setId_utilizator(int id_utilizator) { this.id_utilizator = id_utilizator; }
}

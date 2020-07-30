package com.example.demo.vodafone.dao;

import javax.persistence.*;

@Entity
@Table(name = "POSTARE_UTILIZATOR")
public class PostareUtilizator {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "id_postare")
    private int idPostare;

    @Column(name = "id_Utilizator")
    private int idUtilizator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPostare() {
        return idPostare;
    }

    public void setIdPostare(int idPostare) {
        this.idPostare = idPostare;
    }

    public int getIdUtilizator() {
        return idUtilizator;
    }

    public void setIdUtilizator(int idUtilizator) {
        this.idUtilizator = idUtilizator;
    }
}

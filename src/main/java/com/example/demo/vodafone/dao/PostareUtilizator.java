package com.example.demo.vodafone.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "POSTARE_UTILIZATOR")
public class PostareUtilizator {

    @Column(name = "id_postare")
    private int idPostare;

    @Column(name = "id_Utilizator")
    private int idUtilizator;

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

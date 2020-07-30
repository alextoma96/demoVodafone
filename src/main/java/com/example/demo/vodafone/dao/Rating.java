package com.example.demo.vodafone.dao;

import javax.persistence.*;

@Entity
@Table
public class Rating {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "ID_POSTARE")
    private int idPostare;

    @Column
    private int nota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdPostare() { return idPostare; }

    public void setIdPostare(int idPostare) { this.idPostare = idPostare; }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

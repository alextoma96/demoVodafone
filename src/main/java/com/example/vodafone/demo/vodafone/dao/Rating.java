package com.example.vodafone.demo.vodafone.dao;

import javax.persistence.*;

@Entity
@Table
public class Rating {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int id_postare;

    @Column
    private int nota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_postare() {
        return id_postare;
    }

    public void setId_postare(int id_postare) {
        this.id_postare = id_postare;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

package com.example.demo.vodafone.dao;

import javax.persistence.*;

@Entity
@Table
public class Postare
{
	@Column
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
    @Column
    private String continut;

    @Column
	private float rating;
	
	@Column
	private String titlu;

	public String getContinut()
	{
		return continut;
	}
	
	public void setContinut(String continut)
	{
		this.continut = continut;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getTitlu()
	{
		return titlu;
	}
	
	public void setTitlu(String titlu)
	{
		this.titlu = titlu;
	}

    public float getRating() { return rating; }

    public void setRating(float rating) { this.rating = rating; }
}

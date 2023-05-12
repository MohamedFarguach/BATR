package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Ouvrage {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String prix;
	private String désignation;
	private String quantité;
	private String unité;
	 @OneToMany(mappedBy = "ouvrage")
		private Collection<Ouvrage_Composant> ouvrage = new ArrayList<>();
	@ManyToOne
	private Affaire affaire;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getDésignation() {
		return désignation;
	}
	public void setDésignation(String désignation) {
		this.désignation = désignation;
	}
	public String getQuantité() {
		return quantité;
	}
	public void setQuantité(String quantité) {
		this.quantité = quantité;
	}
	public String getUnité() {
		return unité;
	}
	public void setUnité(String unité) {
		this.unité = unité;
	}
	public Ouvrage(Long id, String prix, String désignation, String quantité, String unité) {
		super();
		this.id = id;
		this.prix = prix;
		this.désignation = désignation;
		this.quantité = quantité;
		this.unité = unité;
	}
	public Ouvrage() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

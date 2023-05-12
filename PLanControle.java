package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PLanControle {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String n_fiche;
	private String	reference;
	private String	 designation;
	private String	quantite;
	private String dimensionchoix6;
	private String dimensionchoix1;
	private String dimensionchoix2;
	private String dimensionchoix3;
	private String dimensionchoix4;
	private String dimensionchoix5;
	
	private String dimensionchoix8;
	private String dimensionchoix9;
	private String dimensionchoix10;
	private String dimensionchoix11;
	private String dimensionchoix12;
	private String dimensionchoix13;
	private String dimensionchoix14;
	private String dimensionchoix15;
	private String dimensionchoix16;
	private String dimensionchoix17;
	private String dimensionchoix18;
	private String dimensionchoix19;
	private String dimensionchoix20;
	private String dimensionchoix21;
	
	private String  controle_interne;
	private String    controle_livraison;
	private String   controle_lieuliv_raison;
	public PLanControle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getN_fiche() {
		return n_fiche;
	}
	public void setN_fiche(String n_fiche) {
		this.n_fiche = n_fiche;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getDimensionchoix6() {
		return dimensionchoix6;
	}
	public void setDimensionchoix6(String dimensionchoix6) {
		this.dimensionchoix6 = dimensionchoix6;
	}
	public String getDimensionchoix1() {
		return dimensionchoix1;
	}
	public void setDimensionchoix1(String dimensionchoix1) {
		this.dimensionchoix1 = dimensionchoix1;
	}
	public String getDimensionchoix2() {
		return dimensionchoix2;
	}
	public void setDimensionchoix2(String dimensionchoix2) {
		this.dimensionchoix2 = dimensionchoix2;
	}
	public String getDimensionchoix3() {
		return dimensionchoix3;
	}
	public void setDimensionchoix3(String dimensionchoix3) {
		this.dimensionchoix3 = dimensionchoix3;
	}
	public String getDimensionchoix4() {
		return dimensionchoix4;
	}
	public void setDimensionchoix4(String dimensionchoix4) {
		this.dimensionchoix4 = dimensionchoix4;
	}
	public String getDimensionchoix5() {
		return dimensionchoix5;
	}
	public void setDimensionchoix5(String dimensionchoix5) {
		this.dimensionchoix5 = dimensionchoix5;
	}
	public String getDimensionchoix8() {
		return dimensionchoix8;
	}
	public void setDimensionchoix8(String dimensionchoix8) {
		this.dimensionchoix8 = dimensionchoix8;
	}
	public String getDimensionchoix9() {
		return dimensionchoix9;
	}
	public void setDimensionchoix9(String dimensionchoix9) {
		this.dimensionchoix9 = dimensionchoix9;
	}
	public String getDimensionchoix10() {
		return dimensionchoix10;
	}
	public void setDimensionchoix10(String dimensionchoix10) {
		this.dimensionchoix10 = dimensionchoix10;
	}
	public String getDimensionchoix11() {
		return dimensionchoix11;
	}
	public void setDimensionchoix11(String dimensionchoix11) {
		this.dimensionchoix11 = dimensionchoix11;
	}
	public String getDimensionchoix12() {
		return dimensionchoix12;
	}
	public void setDimensionchoix12(String dimensionchoix12) {
		this.dimensionchoix12 = dimensionchoix12;
	}
	public String getDimensionchoix13() {
		return dimensionchoix13;
	}
	public void setDimensionchoix13(String dimensionchoix13) {
		this.dimensionchoix13 = dimensionchoix13;
	}
	public String getDimensionchoix14() {
		return dimensionchoix14;
	}
	public void setDimensionchoix14(String dimensionchoix14) {
		this.dimensionchoix14 = dimensionchoix14;
	}
	public String getDimensionchoix15() {
		return dimensionchoix15;
	}
	public void setDimensionchoix15(String dimensionchoix15) {
		this.dimensionchoix15 = dimensionchoix15;
	}
	public String getDimensionchoix16() {
		return dimensionchoix16;
	}
	public void setDimensionchoix16(String dimensionchoix16) {
		this.dimensionchoix16 = dimensionchoix16;
	}
	public String getDimensionchoix17() {
		return dimensionchoix17;
	}
	public void setDimensionchoix17(String dimensionchoix17) {
		this.dimensionchoix17 = dimensionchoix17;
	}
	public String getDimensionchoix18() {
		return dimensionchoix18;
	}
	public void setDimensionchoix18(String dimensionchoix18) {
		this.dimensionchoix18 = dimensionchoix18;
	}
	public String getDimensionchoix19() {
		return dimensionchoix19;
	}
	public void setDimensionchoix19(String dimensionchoix19) {
		this.dimensionchoix19 = dimensionchoix19;
	}
	public String getDimensionchoix20() {
		return dimensionchoix20;
	}
	public void setDimensionchoix20(String dimensionchoix20) {
		this.dimensionchoix20 = dimensionchoix20;
	}
	public String getDimensionchoix21() {
		return dimensionchoix21;
	}
	public void setDimensionchoix21(String dimensionchoix21) {
		this.dimensionchoix21 = dimensionchoix21;
	}
	public String getControle_interne() {
		return controle_interne;
	}
	public void setControle_interne(String controle_interne) {
		this.controle_interne = controle_interne;
	}
	public String getControle_livraison() {
		return controle_livraison;
	}
	public void setControle_livraison(String controle_livraison) {
		this.controle_livraison = controle_livraison;
	}
	public String getControle_lieuliv_raison() {
		return controle_lieuliv_raison;
	}
	public void setControle_lieuliv_raison(String controle_lieuliv_raison) {
		this.controle_lieuliv_raison = controle_lieuliv_raison;
	}
	public PLanControle(Long id, String n_fiche, String reference, String designation, String quantite,
			String dimensionchoix6, String dimensionchoix1, String dimensionchoix2, String dimensionchoix3,
			String dimensionchoix4, String dimensionchoix5, String dimensionchoix8, String dimensionchoix9,
			String dimensionchoix10, String dimensionchoix11, String dimensionchoix12, String dimensionchoix13,
			String dimensionchoix14, String dimensionchoix15, String dimensionchoix16, String dimensionchoix17,
			String dimensionchoix18, String dimensionchoix19, String dimensionchoix20, String dimensionchoix21,
			String controle_interne, String controle_livraison, String controle_lieuliv_raison) {
		super();
		this.id = id;
		this.n_fiche = n_fiche;
		this.reference = reference;
		this.designation = designation;
		this.quantite = quantite;
		this.dimensionchoix6 = dimensionchoix6;
		this.dimensionchoix1 = dimensionchoix1;
		this.dimensionchoix2 = dimensionchoix2;
		this.dimensionchoix3 = dimensionchoix3;
		this.dimensionchoix4 = dimensionchoix4;
		this.dimensionchoix5 = dimensionchoix5;
		this.dimensionchoix8 = dimensionchoix8;
		this.dimensionchoix9 = dimensionchoix9;
		this.dimensionchoix10 = dimensionchoix10;
		this.dimensionchoix11 = dimensionchoix11;
		this.dimensionchoix12 = dimensionchoix12;
		this.dimensionchoix13 = dimensionchoix13;
		this.dimensionchoix14 = dimensionchoix14;
		this.dimensionchoix15 = dimensionchoix15;
		this.dimensionchoix16 = dimensionchoix16;
		this.dimensionchoix17 = dimensionchoix17;
		this.dimensionchoix18 = dimensionchoix18;
		this.dimensionchoix19 = dimensionchoix19;
		this.dimensionchoix20 = dimensionchoix20;
		this.dimensionchoix21 = dimensionchoix21;
		this.controle_interne = controle_interne;
		this.controle_livraison = controle_livraison;
		this.controle_lieuliv_raison = controle_lieuliv_raison;
	}
	
	
}
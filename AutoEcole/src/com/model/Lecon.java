package com.model;
// Generated 1 f�vr. 2015 11:00:11 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Lecon generated by hbm2java
 */
public class Lecon implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7982375504770734592L;
	private int numl;
	private Date dateCours;
	private Date heureDebut;
	private Integer duree;
	private Integer nume;
	private Integer numm;
	private Integer numv;

	public Lecon() {
	}

	public Lecon(int numl) {
		this.numl = numl;
	}

	public Lecon(int numl, Date dateCours, Date heureDebut, Integer duree,
			Integer nume, Integer numm, Integer numv) {
		this.numl = numl;
		this.dateCours = dateCours;
		this.heureDebut = heureDebut;
		this.duree = duree;
		this.nume = nume;
		this.numm = numm;
		this.numv = numv;
	}

	public int getNuml() {
		return this.numl;
	}

	public void setNuml(int numl) {
		this.numl = numl;
	}

	public Date getDateCours() {
		return this.dateCours;
	}

	public void setDateCours(Date dateCours) {
		this.dateCours = dateCours;
	}

	public Date getHeureDebut() {
		return this.heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Integer getNume() {
		return this.nume;
	}

	public void setNume(Integer nume) {
		this.nume = nume;
	}

	public Integer getNumm() {
		return this.numm;
	}

	public void setNumm(Integer numm) {
		this.numm = numm;
	}

	public Integer getNumv() {
		return this.numv;
	}

	public void setNumv(Integer numv) {
		this.numv = numv;
	}

}
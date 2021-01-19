package com.liftstore.entity;
// Generated 16 Oca 2021 12:42:51 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bayi generated by hbm2java
 */
@Entity
@Table(name = "bayi", catalog = "liftstore")
public class Bayi implements java.io.Serializable {

	private Integer bayiId;
	private String bayiAdi;
	private String adres;
	private String telNo;
	private String email;
	private String parola;
	private Set<Siparis> siparises = new HashSet<Siparis>(0);

	public Bayi() {
	}

	public Bayi(String bayiAdi, String adres, String email, String parola) {
		this.bayiAdi = bayiAdi;
		this.adres = adres;
		this.email = email;
		this.parola = parola;
	}

	public Bayi(String bayiAdi, String adres, String telNo, String email, String parola, Set siparises) {
		this.bayiAdi = bayiAdi;
		this.adres = adres;
		this.telNo = telNo;
		this.email = email;
		this.parola = parola;
		this.siparises = siparises;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "bayiID", unique = true, nullable = false)
	public Integer getBayiId() {
		return this.bayiId;
	}

	public void setBayiId(Integer bayiId) {
		this.bayiId = bayiId;
	}


	@Column(name = "bayiAdi", nullable = false, length = 100)
	public String getBayiAdi() {
		return this.bayiAdi;
	}

	public void setBayiAdi(String bayiAdi) {
		this.bayiAdi = bayiAdi;
	}

	@Column(name = "adres", nullable = false, length = 250)
	public String getAdres() {
		return this.adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	@Column(name = "telNo", length = 20)
	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "parola", nullable = false, length = 16)
	public String getParola() {
		return this.parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bayi")
	public Set<Siparis> getSiparises() {
		return this.siparises;
	}

	public void setSiparises(Set<Siparis> siparises) {
		this.siparises = siparises;
	}

	public void setRegisterDate(Date date) {
		// TODO Auto-generated method stub
		
	}


}

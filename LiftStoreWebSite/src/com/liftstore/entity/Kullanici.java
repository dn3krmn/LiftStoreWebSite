package com.liftstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "Kullanici.findAll", query = "SELECT  u FROM  Kullanici u ORDER BY u.kullaniciAdi"),
	@NamedQuery(name = "Kullanici.findByEmail", query = "SELECT  u FROM  Kullanici u WHERE u.email = :email"),
	@NamedQuery(name = "Kullanici.countAll", query = " SELECT Count(*) FROM Kullanici u" ),
	@NamedQuery(name = "Kullanici.checkLogin", query = "SELECT u FROM Kullanici u WHERE u.email = :email AND parola = :parola")
})
public class Kullanici {

	private Integer kullaniciId;
	private String kullaniciAdi;
	private String email;
	private String parola;
	
	public Kullanici() {
	}

	public Kullanici(String kullaniciAdi, String email, String parola) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.email = email;
		this.parola = parola;
	}

	@Column(name = "kullaniciID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getKullaniciId() {
		return kullaniciId;
	}

	public void setKullaniciId(Integer kullaniciId) {
		this.kullaniciId = kullaniciId;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

}

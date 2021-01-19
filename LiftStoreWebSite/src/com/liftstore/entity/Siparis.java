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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Siparis generated by hbm2java
 */
@Entity
@Table(name = "siparis", catalog = "liftstore")
public class Siparis implements java.io.Serializable {

	private Integer siparisId;
	private Bayi bayi;
	private Date siparisTarihi;
	private float siaprisTutari;
	private String siparisDurumu;
	private String odemeYontemi;
	private Set<Siparisdetayi> siparisdetayis = new HashSet<Siparisdetayi>(0);

	public Siparis() {
	}

	public Siparis(Bayi bayi, Date siparisTarihi, float siaprisTutari, String siparisDurumu, String odemeYontemi) {
		this.bayi = bayi;
		this.siparisTarihi = siparisTarihi;
		this.siaprisTutari = siaprisTutari;
		this.siparisDurumu = siparisDurumu;
		this.odemeYontemi = odemeYontemi;
	}

	public Siparis(Bayi bayi, Date siparisTarihi, float siaprisTutari, String siparisDurumu, String odemeYontemi,
			Set<Siparisdetayi> siparisdetayis) {
		this.bayi = bayi;
		this.siparisTarihi = siparisTarihi;
		this.siaprisTutari = siaprisTutari;
		this.siparisDurumu = siparisDurumu;
		this.odemeYontemi = odemeYontemi;
		this.siparisdetayis = siparisdetayis;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "siparisID", unique = true, nullable = false)
	public Integer getSiparisId() {
		return this.siparisId;
	}

	public void setSiparisId(Integer siparisId) {
		this.siparisId = siparisId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bayiId", nullable = false)
	public Bayi getBayi() {
		return this.bayi;
	}

	public void setBayi(Bayi bayi) {
		this.bayi = bayi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "siparisTarihi", nullable = false, length = 19)
	public Date getSiparisTarihi() {
		return this.siparisTarihi;
	}

	public void setSiparisTarihi(Date siparisTarihi) {
		this.siparisTarihi = siparisTarihi;
	}

	@Column(name = "siaprisTutari", nullable = false, precision = 12, scale = 0)
	public float getSiaprisTutari() {
		return this.siaprisTutari;
	}

	public void setSiaprisTutari(float siaprisTutari) {
		this.siaprisTutari = siaprisTutari;
	}

	@Column(name = "siparisDurumu", nullable = false, length = 50)
	public String getSiparisDurumu() {
		return this.siparisDurumu;
	}

	public void setSiparisDurumu(String siparisDurumu) {
		this.siparisDurumu = siparisDurumu;
	}

	@Column(name = "odemeYontemi", nullable = false, length = 50)
	public String getOdemeYontemi() {
		return this.odemeYontemi;
	}

	public void setOdemeYontemi(String odemeYontemi) {
		this.odemeYontemi = odemeYontemi;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "siparis")
	public Set<Siparisdetayi> getSiparisdetayis() {
		return this.siparisdetayis;
	}

	public void setSiparisdetayis(Set<Siparisdetayi> siparisdetayis) {
		this.siparisdetayis = siparisdetayis;
	}

}

package com.liftstore.entity;
// Generated 16 Oca 2021 12:42:51 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SiparisdetayiId generated by hbm2java
 */
@Embeddable
public class SiparisdetayiId implements java.io.Serializable {

	private int siparisId;
	private int liftId;
	private int siparisAdeti;
	private float toplamTutar;

	public SiparisdetayiId() {
	}

	public SiparisdetayiId(int siparisId, int liftId, int siparisAdeti, float toplamTutar) {
		this.siparisId = siparisId;
		this.liftId = liftId;
		this.siparisAdeti = siparisAdeti;
		this.toplamTutar = toplamTutar;
	}

	@Column(name = "siparisId", nullable = false)
	public int getSiparisId() {
		return this.siparisId;
	}

	public void setSiparisId(int siparisId) {
		this.siparisId = siparisId;
	}

	@Column(name = "liftId", nullable = false)
	public int getLiftId() {
		return this.liftId;
	}

	public void setLiftId(int liftId) {
		this.liftId = liftId;
	}

	@Column(name = "siparisAdeti", nullable = false)
	public int getSiparisAdeti() {
		return this.siparisAdeti;
	}

	public void setSiparisAdeti(int siparisAdeti) {
		this.siparisAdeti = siparisAdeti;
	}

	@Column(name = "toplamTutar", nullable = false, precision = 12, scale = 0)
	public float getToplamTutar() {
		return this.toplamTutar;
	}

	public void setToplamTutar(float toplamTutar) {
		this.toplamTutar = toplamTutar;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SiparisdetayiId))
			return false;
		SiparisdetayiId castOther = (SiparisdetayiId) other;

		return (this.getSiparisId() == castOther.getSiparisId()) && (this.getLiftId() == castOther.getLiftId())
				&& (this.getSiparisAdeti() == castOther.getSiparisAdeti())
				&& (this.getToplamTutar() == castOther.getToplamTutar());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSiparisId();
		result = 37 * result + this.getLiftId();
		result = 37 * result + this.getSiparisAdeti();
		result = 37 * result + (int) this.getToplamTutar();
		return result;
	}

}

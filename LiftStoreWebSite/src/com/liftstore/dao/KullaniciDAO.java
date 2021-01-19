package com.liftstore.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import com.liftstore.entity.Kullanici;

public class KullaniciDAO extends JpaDAO<Kullanici> implements GenericDAO<Kullanici> {

	public KullaniciDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	public Kullanici create(Kullanici kullanici) {
		return super.create(kullanici);
	}
	
	@Override
	public Kullanici update(Kullanici kullanici) {
		return super.update(kullanici);
	}

	@Override
	public  Kullanici get(Object kullaniciId) {
		return super.find(Kullanici.class, kullaniciId);
	}
	
	public Kullanici findByEmail(String email) {
		List<Kullanici> listKullanici = super.findWithNamedQuery("Kullanici.findByEmail", "email", email);
		
		if(listKullanici != null && listKullanici.size() > 0) {
			return listKullanici.get(0);
		}
		return null;
	}
	
	public boolean checkLogin(String email, String parola){
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("email", email);
		parameters.put("parola", parola);
		
		List<Kullanici> kullaniciList = super.findWithNamedQuery("Kullanici.checkLogin", parameters);
		
			if(kullaniciList.size() == 1){
					return true;
			}
			
			return false;
	}

	@Override
	public void delete(Object kullaniciId) {
		super.delete(Kullanici.class, kullaniciId);
		
	}

	@Override
	public List<Kullanici> listAll() {
		return super.findWithNamedQuery("Kullanici.findAll");
	}

	@Override
	public long count() {
		return super.countWithNamedQuery("Kullanici.countAll");
		
	}

	

}

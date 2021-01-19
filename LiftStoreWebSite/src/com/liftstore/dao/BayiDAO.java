package com.liftstore.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import com.liftstore.entity.Bayi;

public class BayiDAO extends JpaDAO<Bayi> implements GenericDAO<Bayi> {

	

	public BayiDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Bayi create(Bayi bayi) {
		bayi.setRegisterDate(new Date());
		return super.create(bayi);
	}

	@Override
	public Bayi get(Object bayiId) {
		return super.find(Bayi.class, bayiId);
	}

	@Override
	public void delete(Object bayiId) {
		super.delete(Bayi.class, bayiId);
	}

	@Override
	public List<Bayi> listAll() {
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


}

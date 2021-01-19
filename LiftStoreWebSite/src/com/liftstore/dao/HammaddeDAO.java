package com.liftstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.liftstore.entity.Hammadde;

public class HammaddeDAO extends JpaDAO<Hammadde> implements GenericDAO<Hammadde> {

	public HammaddeDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hammadde create(Hammadde hammadde) {
		// TODO Auto-generated method stub
		return super.create(hammadde);
	}

	@Override
	public Hammadde update(Hammadde t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hammadde get(Object hammddeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object hammaddeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Hammadde> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}

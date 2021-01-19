package com.liftstore.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import com.liftstore.entity.Lift;

public class LiftDAO extends JpaDAO<Lift> implements GenericDAO<Lift> {

	public LiftDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Lift create(Lift lift) {
		lift.setLastUpdateTime(new Date());
		return super.create(lift);
	}
	
	@Override
	public Lift get(Object id) {
		return null;
	}

	

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lift> listAll() {
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

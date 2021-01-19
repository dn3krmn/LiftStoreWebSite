package com.liftstore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.liftstore.entity.Hammadde;
import com.liftstore.entity.Lift;

public class HammaddeDAOTest {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static HammaddeDAO hammaddeDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("LiftStoreWebSite");
		entityManager = entityManagerFactory.createEntityManager();
		
		hammaddeDao = new HammaddeDAO(entityManager);
	}
	
	@Test
	public void testCreateHammadde() {
		Hammadde madde = new Hammadde();
		madde.setHammaddeAdi("hammadde1");
		madde.setFiyat(1000);
		madde.setStokMiktari(8);
		madde.setTedarikSuresi(7);
		
		Hammadde raw = hammaddeDao.create(madde);
		
		assertTrue(raw.getHammaddeId() > 0);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
	}

	

}

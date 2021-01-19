package com.liftstore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.liftstore.entity.Bayi;

public class BayiDAOTest {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static BayiDAO bayiDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		entityManagerFactory = Persistence.createEntityManagerFactory("LiftStoreWebSite");
		entityManager = entityManagerFactory.createEntityManager();
		
		bayiDao = new BayiDAO(entityManager);
	}


	@Test
	public void testCreateBayi() {
		Bayi bayi = new Bayi();
		bayi.setBayiAdi("Lift Store Albania");
		bayi.setEmail("albania@gmail.com");
		bayi.setParola("albania");
		bayi.setTelNo("03325685656");
		bayi.setAdres("Ýþkodra, Arnavutluk");
		
		Bayi savedBayi = bayiDao.create(bayi);
		assertTrue(savedBayi.getBayiId() > 0);
	}

	@Test
	public void testGet() {
		Integer bayiId = 1;
		Bayi bayi = bayiDao.get(bayiId);
		
		assertNotNull(bayi);
	}
	
	@Test
	public void testUpdateBayi() {
		Bayi bayi = bayiDao.get(1);
		String bayiAdi = "Lift Store Konya";
		bayi.setBayiAdi(bayiAdi);
		
		Bayi updatedBayi = bayiDao.update(bayi);
		
		assertTrue(updatedBayi.getBayiAdi().equals(bayiAdi));
	}

	@Test
	public void testDeleteBayi() {
		Integer bayiId = 3;
		bayiDao.delete(bayiId);
		Bayi bayi = bayiDao.get(1);
		
		assertNotNull(bayi);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
	}

}

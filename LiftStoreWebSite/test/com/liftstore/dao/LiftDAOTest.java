package com.liftstore.dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.liftstore.entity.Hammadde;
import com.liftstore.entity.Lift;

public class LiftDAOTest {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static LiftDAO liftDao;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("LiftStoreWebSite");
		entityManager = entityManagerFactory.createEntityManager();
		
		liftDao = new LiftDAO(entityManager);
	}

	

	@Test
	public void testCreateLift() throws IOException {
		Lift newLift = new Lift();
		
		Hammadde madde = new Hammadde();
		madde.setHammaddeId(1);
		
		newLift.setLiftModeli("Týr Lifti");
		newLift.setSeriNo("K3");
		newLift.setLiftYukseklik(5);
		newLift.setStokMiktari(7);
		newLift.setFiyat(1000);
		newLift.setHammadde(madde);
		
		String imagePath = "C:\\Users\\dn3kr\\Desktop\\Kamyon Lifti.jpg";
		byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));
		
		newLift.setResim(imageBytes);
		
		Lift createdLift = liftDao.create(newLift);
		
		assertTrue(createdLift.getLiftId() > 0);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
	}

}

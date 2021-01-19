package com.liftstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.liftstore.entity.Kullanici;

public class KullaniciDAOTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static KullaniciDAO kullaniciDAO;
	
	@BeforeClass
	public static void setUpClass() {
		entityManagerFactory = Persistence.createEntityManagerFactory("LiftStoreWebSite");
		entityManager = entityManagerFactory.createEntityManager();
		
		kullaniciDAO = new KullaniciDAO(entityManager);
	}

	@Test
	public void testCreateKullanici() {
		Kullanici kullanici1 = new Kullanici();
		kullanici1.setEmail("ismailiseri@gmail.com");
		kullanici1.setKullaniciAdi("Ýsmail Ýþeri");
		kullanici1.setParola("123456");

		kullanici1 =  kullaniciDAO.create(kullanici1);
		
		entityManager.close();
		entityManagerFactory.close();
		
		assertTrue(kullanici1.getKullaniciId() > 0);
	}
	
	@Test(expected = PersistenceException.class)
	public void testCreateKullaniciFieldsNotSet() {
		Kullanici kullanici1 = new Kullanici();
		kullanici1 =  kullaniciDAO.create(kullanici1);
	}
	
	@Test
	public void testUpdateKullanici() {
		Kullanici kullanici = new Kullanici();
		kullanici.setKullaniciId(4);
		kullanici.setEmail("pa@gmail.com");
		kullanici.setKullaniciAdi("Pamela Agaj");
		kullanici.setParola("padk335");
		
		kullanici = kullaniciDAO.update(kullanici);
		
		String expected = "padk335";
		String actual = kullanici.getParola();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetKullaniciFound() {
		Integer kullaniciId = 4;
		Kullanici kullanici = kullaniciDAO.get(kullaniciId);
		if(kullanici !=null) {
			System.out.println(kullanici.getEmail());
		}
		
		assertNotNull(kullanici);
	}
	
	@Test 
	public void testGetKullaniciNotFound() {
		Integer kullaniciId= 99;
		Kullanici kullanici= kullaniciDAO.get(kullaniciId);
		
		assertNull(kullanici);
	}
	
	@Test
	public void testDeleteKullanici() {
		Integer kullaniciId=40;
		kullaniciDAO.delete(kullaniciId);
		Kullanici kullanici = kullaniciDAO.get(kullaniciId);
		assertNull(kullanici);	
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void testDeleteNonExistKullanici() {
		Integer kullaniciId=5;
		kullaniciDAO.delete(kullaniciId);		
	}
	
	@Test
	public void testListAll() {
		List<Kullanici> listKullanici = kullaniciDAO.listAll();
		
		for(Kullanici kullanici : listKullanici) {
			System.out.println(kullanici.getEmail());
		}
		
		assertTrue(listKullanici.size() > 0);
	}
	
	@Test
	public void testCount() {
		long totalKullanici = kullaniciDAO.count();
		
		assertEquals(2, totalKullanici);
	}
	
	@Test 
	public void testCheckLoginSuccess(){
		String email ="dk@gmail.com";
		String parola ="dkpa335";
		boolean loginResult = kullaniciDAO.checkLogin(email, parola);
		assertTrue(loginResult);
	}
	
	@Test  
	public void testCheckLoginFailed(){
		String email ="sth@gmail.com";
		String parola ="123456";
		boolean loginResult = kullaniciDAO.checkLogin(email, parola);
		assertFalse(loginResult);
	}
	
	@Test
	public void testFindByEmail() {
		String email = "pa@gmail.com";
		Kullanici kullanici = kullaniciDAO.findByEmail(email);
		assertNotNull(kullanici);
	}
	
	@AfterClass
	public static void tearDownClass() {
		
		entityManager.close();
		entityManagerFactory.close();
	}

}

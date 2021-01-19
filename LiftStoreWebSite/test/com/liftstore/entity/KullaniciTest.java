package com.liftstore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.liftstore.entity.Kullanici;

public class KullaniciTest {

	public static void main(String[] args) {
		
		Kullanici kullanici1 = new Kullanici();
		kullanici1.setEmail("dk@gmail.com");
		kullanici1.setKullaniciAdi("Döne Karaman");
		kullanici1.setParola("dkpa335");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LiftStoreWebSite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(kullanici1);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("Kalýcý Kullanici nesnesi.");
	}

}

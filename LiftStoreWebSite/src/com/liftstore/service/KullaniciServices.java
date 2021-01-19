package com.liftstore.service;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liftstore.dao.KullaniciDAO;
import com.liftstore.entity.Kullanici;

public class KullaniciServices {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private KullaniciDAO kullaniciDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public KullaniciServices(EntityManager entityManager, HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		entityManagerFactory = Persistence.createEntityManagerFactory("LiftStoreWebSite");
		entityManager = entityManagerFactory.createEntityManager();
		kullaniciDAO = new KullaniciDAO(entityManager);		
	}
	
	public void listKullanici() throws ServletException, IOException {
		listKullanici(null);	
	}
	
	public void listKullanici(String message) throws ServletException, IOException{
		List<Kullanici> listKullanici= kullaniciDAO.listAll();

		request.setAttribute("listKullanici", listKullanici);
		
		if(message != null) {
			request.setAttribute("message", message);
		}
		
		String listPage = "kullanici_list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);
		
		requestDispatcher.forward(request, response);
	}
	
	public void createKullanici() throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String fullName = request.getParameter("fullname");
		String parola = request.getParameter("parola");
		
		Kullanici existKullanici = kullaniciDAO.findByEmail(email);
		
		if(existKullanici != null) {
			String message = "Kullanýcý oluþturulamadý. " + email + " email adresini kullanan bir kullanýcý zaten var.";
			request.setAttribute("message", message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("message.jsp");
			dispatcher.forward(request, response);
		}
		else {
			Kullanici yeniKullanici = new Kullanici(fullName, email, parola);
			kullaniciDAO.create(yeniKullanici);
			listKullanici("Yeni kullanýcý baþarýyla oluþturuldu");
		}

		
	}

	public void editUser() throws ServletException, IOException {
		int kullaniciId = Integer.parseInt(request.getParameter("id"));
		Kullanici kullanici = kullaniciDAO.get(kullaniciId);
		
		String editPage = "user_form.jsp";
		request.setAttribute("kullanici", kullanici);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(editPage);
		requestDispatcher.forward(request, response);
		
	}
	
	public void login() throws ServletException, IOException{

		String email = request.getParameter("email");
		String parola = request.getParameter("parola");
		
		boolean loginResult = kullaniciDAO.checkLogin(email, parola);
		if(loginResult){
			System.out.println("User is authenticated");
			request.getSession().setAttribute("email", email);
			RequestDispatcher dispatcher =  request.getRequestDispatcher("/admin/");
			dispatcher.forward(request, response);
		}
		else {
			String message= "Login failed";
			request.setAttribute("message", message);
			RequestDispatcher dispatcher =  request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
	}
}

package com.liftstore.controller.admin.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liftstore.service.KullaniciServices;

@WebServlet("/admin/users")
public class ListKullaniciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ListKullaniciServlet() {
        super();
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		KullaniciServices kullaniciServices = new KullaniciServices(null, request, response);
		kullaniciServices.listKullanici();
		
	}


}

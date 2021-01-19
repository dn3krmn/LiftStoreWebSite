<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html lang="tr">
<html>
<head>
	<meta charset="UTF-8">
	<title>Manage Users - LiftStore Administration</title>
	<link rel="stylesheet" href="../css/style.css">
	<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="../js/jquery-validate.min.js"></script>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<div align="center">
		<h1 class="pageheading">Kullanıcı Yönetimi</h1>
		<h3><a href = "user_form.jsp">Yeni Kullanıcı Ekle</a></h3>
	</div>
	
	<c:if test="${message!=null}">
		<div align="center">
			<h4 class="message">${message}</h4>
		</div>
	</c:if>
	
	<div align="center">
		 <table border = "1" cellpadding = "7">
		 	<tr>
		 		<th>Index</th>
		 		<th>ID</th>
		 		<th>Ad Soyad</th>
		 		<th>Email</th>
		 		<th>İşlemler</th>
		 	</tr>
		 	<c:forEach var="user" items="${listKullanici}" varStatus="status">
		 		<tr>
		 			<td>${status.index + 1}</td>
		 			<td>${user.kullaniciId}</td>
		 			<td>${user.kullaniciAdi}</td>
		 			<td>${user.email}</td>		
		 				
		 			<td>
		 				<a href="edit_user?id=${user.kullaniciId}">Düzenle</a> &nbsp;
		 				<a href="">Sil</a>
		 			</td>
		 		</tr>
		 	</c:forEach>
		 </table>
	</div>
	
	<div align="center">
		
	
	<jsp:directive.include file="footer.jsp"/>
</body>
</html>
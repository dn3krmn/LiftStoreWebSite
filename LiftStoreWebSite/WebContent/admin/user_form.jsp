<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html lang="tr">
<html>
<head>
<meta charset="UTF-8">
<title>LiftStore Administration</title>
<link rel="stylesheet" href="../css/style.css">
<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="../js/jquery-validate.min.js"></script>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<div align="center">
		<h2>
			<c:if test="$kullanici != null">
				Kullanıcıyı Düzenle
			</c:if>
			<c:if test="$kullanici == null">
				Yeni Kullanıcı Ekle
			</c:if>
		</h2>
	</div>
	
	<div align="center">
		<form action="create_user" method="post" id="userForm">
			<table class="form">
				<tr>
					<td align="right">Ad Soyad:</td>
					<td align="left"><input type="text" id="fullname" name="fullname" size="20" value="${kullanici.kullaniciAdi}" /></td>
				</tr>
				<tr>
					<td align="right">Email:</td>
					<td align="left"><input type="text" id="email" name="email" size="20" value="${kullanici.email}" /></td>
				</tr>
				<tr>
					<td align="right">Parola:</td>
					<td align="left"><input type="password" id="parola" name="parola" size="20" value="${kullanici.parola}" /></td>
				</tr>
				<tr><td>&nbsp;</td></tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit">Kaydet</button>
						<button onclick="javascript:history.go(-1);">İptal</button>
					</td>
				</tr>
			</table>
		</form>
	</div>

	<jsp:directive.include file="footer.jsp"/>
</body>

<script type="text/javascript">

	$(document).ready(function(){
		$("#userForm").validate({
			
			rules: {
				email: {
					required: true,
					email: true
				},
				fullname: "gerekli",
				parola: "gerekli",
			},
			
			messages: {
				email: {
					required: "Please enter email",
					email: "Please enter an valid email address"
				},
				fullname: "Please enter full name",
				parola: "Please enter parola"
			},
			
		});
		
	});

</script>
</html>
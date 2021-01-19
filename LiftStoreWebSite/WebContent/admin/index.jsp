<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html lang="tr">
<html>
<head>
	<meta charset="UTF-8">
	<title>LiftStore Administration</title>
	<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<div align="center">
		<h2 class="pageheading">Yönetim Paneli</h2>
	</div>
	
	<div align="center">
		<hr width="60%" />
		<h2 class="pageheading">Hızlı İşlemler:</h2>
		<b>
		<a href="create_lift">Lift Ekle</a> &nbsp;
		<a href="create_user">Kullanıcı Ekle</a> &nbsp;
		<a href="create_bayi">Bayi Ekle</a> &nbsp;
		<a href="create_hammadde">Hammadde Ekle</a>
		</b> 
	</div>
	
	<div align="center">
		<hr width="60%" />
		<h2 class="pageheading">Son Satışlar:</h2>
	</div>
	
	<div align="center">
		<hr width="60%" />
		<h2 class="pageheading">Statistics:</h2>
		<hr width="60%" />
	</div>
	
	<jsp:directive.include file="footer.jsp"/>
</body>
</html>
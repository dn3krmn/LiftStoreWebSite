<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html lang="tr">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center" >
		<jsp:directive.include file="header.jsp"/>
	</div>
	<div align="center" >
		<h2> Lütfen Giriş Yapınız</h2>
		<form action="">
			Kullanıcı adı : <input type="text" size="10" ><br/>
			Şifre: <input type="password" size="10" > <br/>
			<input type="submit" value="Oturum aç" />
			</form>
			
	</div>
	<div align="center" >
		<jsp:directive.include file="footer.jsp"/>
	</div>
</body>
</html>
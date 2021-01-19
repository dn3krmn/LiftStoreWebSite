<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html lang="tr">
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/style.css">
<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="../js/jquery-validate.min.js"></script>
<title>LiftStore Administration</title>
</head>
<body>
	<div align="center">
        <h2>Yönetim Paneli</h2>
        <h2>Yönetici Girişi </h2>
        
        <c:if test = "${message != null}">
        <div align="center">
            <h4 class="message">
                ${message}
            </h4>
        </div>
        </c:if>
        
        <form id="loginForm" action="login" method="post">
        <table>
            <tr>
                <td>Email :</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Parola :</td>
                <td><input type="password" name="parola" id="parola"></td>
            </tr>
            <tr>
                
                <td colspan="2" align="center">
                	<button type="submit" >Login</button>
                </td>
            </tr>

        </table>
        </form>
    </div>

</body>
<script type="text/javascript">

	$(document).ready(function(){
		$("#loginForm").validate({
			
			rules: {
				email: {
					required: true,
					email: true
				},
				parola: "gerekli",
			},
			
			messages: {
				email: {
					required: "Please enter email",
					email: "Please enter an valid email address"
				},
				parola: "Please enter parola"
			},
			
		});
		
	});

</script>
</html>
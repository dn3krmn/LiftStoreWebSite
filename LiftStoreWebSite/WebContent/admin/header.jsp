<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html lang="tr">
<div align="center">
	<div>
		<img src="../images/liftstoreadminlogo.png"/>
	</div>
	<div>
		Welcome, <c:out value="${sessionScope.email}"/> | <a href="logout">Çıkış</a>
		<br/><br/>
	</div>
	<div id="headermenu" style="display:table">
		<div> 
			<a href="users">
			<img src="../images/user.png"/><br>Kullanıcılar
			</a>
		</div>		
		<div>  
			<a href="lift">
			<img src="../images/lift.png"/><br>Liftler
			</a>
	    </div>
	   <div> 
			<a href="bayi">
			<img src="../images/bayi.png"/><br>Bayiler
			</a>
	    </div>
	   <div> 
			<a href="hammadde">
			<img src="../images/hammadde.png"/><br>Hammaddeler
			</a>
	    </div>
	   <div>  
			<a href="orders">
			<img src="../images/sepet.png"/><br>Siparişlerler
			</a>
	    </div>
	    <div>   
			<a href="customers">
			<img src="../images/customer.png"/><br>Müşteriler
			</a>
	    </div>
		  
	</div>
	
</div>
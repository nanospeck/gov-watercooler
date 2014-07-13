<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@page isELIgnored="false" %>  
<%@page contentType="text/html;charset=UTF-8" %>    
<html>
<body>
	<h1>Data bites :</h1>
	
	${cardDTO.description}
	<br/>
	<img src="/graphs/R2001.png" alt="">
	<br/>
	<a href='<c:url value="/cardprev"/>'>Previous Card</a>
	<a href='<c:url value="/carddetails/${cardDTO.id}"/>'>Card Details</a>
	<a href='<c:url value="/cardnext/${cardDTO.id}"/>'>Next Card</a> 
	<!-- <a href="cardprev">Prev Card</a> -->
	<!-- <a href="carddetails">Card Details</a>	 -->
	<%-- <a href="cardnext/"+${cardDTO.id}>Next Card</a> --%>
</body>
</html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@page isELIgnored="false" %>  
<%@page contentType="text/html;charset=UTF-8" %>  
<html>
<body>
	<h1>Card details</h1>
	<h3> Card desc : ${cardDTO.description}</h3>
	<br/>
	<a href='<c:url value="/getcard/${cardDTO.id}"/>'>Back</a>
</body>
</html>
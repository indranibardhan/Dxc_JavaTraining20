<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW</title>
</head>
<body>
<H1>Welcome to Noida Sport Academy</H1>
	<br>

	<a href="add">1. Add an Athlete</a><br>
	
	<a href="view">2. Show all Athletes Details</a>
	
	<h1>Athlete Details</h1>
	<table border="2" width="70%" cellpadding="2">
	
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Gender</th>
	<th>Category</th>
	<th>Email</th>
	<th>Mobile</th>
	</tr>
    <c:forEach var="athlete" items="${list}"> 
    <tr>
    <td>${athlete.athleteId}</td>
    <td>${athlete.athleteName}</td>
    <td>${athlete.athleteGender}</td>
    <td>${athlete.category}</td>
    <td>${athlete.athleteEmail}</td>
    <td>${athlete.athleteMobile}</td>
    </tr>
    </c:forEach>
    </table>

</body>
</html>
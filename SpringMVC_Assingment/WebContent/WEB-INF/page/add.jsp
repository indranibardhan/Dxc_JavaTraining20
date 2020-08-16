<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD</title>
</head>
<body>
<H1>Welcome to Noida Sport Academy</H1>
	<br>

	<a href="add">1. Add an Athlete</a><br>
	
	<a href="view">2. Show all Athletes Details</a>
	
	<h1>Add New Athlete Name</h1>
	
	<form:form method="post" action="save">
	<table>
	<tr>  
          <td>
                <label for="athleteName">Name</label>
            </td>
            <td>
                <input type="text" id="athleteName" name="athleteName">
            </td>
    </tr>  
    <tr>
        	<td>
                <label>Gender</label>
            </td>
            <td>
                <label>
                    <input type="radio" value="f" name="athleteGender"> Female</label>
                    <label>
                    <input value="m" type="radio" name="athleteGender"> Male</label>
            </td>
    </tr>
    <tr>
            <td>
                    <label for="category">Category</label>
            </td>
            <td>
                    <select id="category" name="category">
                        <option disabled selected>--Choose Category--</option>
                            <optgroup label="Metros">
                                <option>Running</option>
                                <option>High Jump</option>
                                <option>Hurdles</option>
                                <option>Relay</option>
                                <option>Shot Put</option>
                                <option>Javelin Throw</option>
                            </optgroup>
                    </select>
            </td>
        </tr>
        <tr>
            <td>
                <label for="athleteEmail">Email</label>
            </td>
            <td>
                <input type="text" id="athleteEmail" name="athleteEmail">
                <button type="button">Check</button>
            </td>
        </tr>
        <tr>
        	<td>
        		<label for="athleteMobile">Mobile</label><br><br>
 			    <input type="tel" id="athleteMobile" name="athleteMobile">
        	</td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Add">
                <button type="button"><b>Cancel</b></button>
            </td>
        </tr>
        
	</table>
	</form:form>

</body>
</html>
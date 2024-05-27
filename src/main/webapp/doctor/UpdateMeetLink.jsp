<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.virtusa.entity.Doctor" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Virtual Meet Link Form</title>
</head>
<body>
    <h2>Doctor Virtual Meet Link Form</h2>
     <c:if test="${not empty succMsg}">
		        <p class="text-center text-success fs-3">${succMsg}</p>
		        <c:remove var="succMsg" scope="session"/>
		    </c:if>
		    <c:if test="${not empty errorMsg}">
		        <p class="text-center text-success fs-3">${errorMsg}</p>
		        <c:remove var="errorMsg" scope="session"/>
		    </c:if>
    <form action="UpdateMeetLink" method="post">
        <input type="hidden" name="doctorId" value="${sessionScope.doctorObj.doctorId}" /> 
        <label for="virtualMeetLink">Virtual Meet Link:</label><br>
        <input type="text" id="virtualMeetLink" name="virtualMeetLink" required><br> 
        <input type="submit" value="Submit">
    </form>
</body>
</html>

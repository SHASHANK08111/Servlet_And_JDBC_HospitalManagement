<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
 <%@page import="java.util.ArrayList"%>
 <%@page import="com.virtusa.entity.Appointment"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
     <%@include file="../components/allcss.jsp"%>
    <link rel="stylesheet" href="../components/navbar.css">
</head>
<body>
    <%@include file="navbar.jsp"%>
    <div class="container">
      <h2>Appointment Details</h2>
      <div class="table-responsive">
        <table class="table table-bordered table-striped">
          <thead>
            <tr>
              <th>Appointment ID</th>
              <th>Username</th>
              <th>Age</th>
              <th>Disease</th>
              <th>Appointment Date</th>
              <th>Slot</th>
              <th>Doctor Name</th>
              <th>Send Link</th>
              <th>Invite status</th>
              <th>Comment</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
            <%

              ArrayList<Appointment> appointmentList = (ArrayList<Appointment>) request.getAttribute("appointments");
              for (Appointment appointment : appointmentList) {
            %>
              <tr>
                <td><%= appointment.getAppointmentId() %></td>
                <td><%= appointment.getUsername() %></td>
                <td><%= appointment.getAge() %></td>
                <td><%= appointment.getDisease() %></td>
                <td><%= appointment.getAppointmentDate() %></td>
                <td><%= appointment.getSlot() %></td>
                <td><%= appointment.getDoctorName() %></td>
                <td> 
	                <form action="SendMeetLinkToAppointment" method="post">
                        <input type="hidden" name="appointmentId" value="<%= appointment.getAppointmentId()%>">
                        <button type="submit" class="btn btn-primary">Send Link</button>
	                </form>
                </td>
                <td>  
		           <td><%= appointment.getisLinkInvite() %></td> 
		        </td>
                <td><%= appointment.getComment() %></td>
                <td><%= appointment.getConsultationStatus() %></td>
              </tr>
            <% } %>
          </tbody>
        </table>
       
      </div>
    </div>
</body>
</html>
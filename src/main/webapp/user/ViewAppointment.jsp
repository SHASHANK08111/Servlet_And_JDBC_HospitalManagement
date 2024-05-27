 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@page import="com.db.DBConnect"%>
 <%@page import="java.util.*"%>
 <%@page import="com.virtusa.dao.AppointmentDao"%>
 <%@page import="com.virtusa.Service.AppointmentService"%>
 <%@page import="com.virtusa.dao.DoctorDao"%>
 <%@page import="com.virtusa.dao.slotDao"%>
 <%@page import="java.util.ArrayList"%>
 <%@page import=" com.virtusa.entity.Specialist"%>
 <%@page import=" com.virtusa.entity.User"%>
 <%@page import=" com.virtusa.entity.Doctor"%>
 <%@page import=" com.virtusa.entity.Slot"%>
 <%@page import=" com.virtusa.entity.Appointment"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Appointment</title>
    <%@include file="../components/allcss.jsp"%> 
    <link rel="stylesheet" href="../components/navbar.css">
    <style>
       body {
            background-color: #f8f9fa;
        }
        .appointment-card {
            border: 1px solid #ddd;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
            background-color: #fff;
        }
        .appointment-card .card-body {
            padding: 20px;
        }
        .label {
            font-weight: bold;
        }
        .btn-block {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <%@include file="../components/navbar.jsp"%>
    
    <% 
        int userId = -1;
        Object userObj = request.getSession().getAttribute("userObj");
        if(userObj != null && userObj instanceof User) {
            User user = (User) userObj;
            userId = user.getUserId();
        }
        List<Appointment> appointmetsOfUser = null;
        if(userId != -1) {

            AppointmentService appointmentSevice=new AppointmentService(DBConnect.getConnection());
            appointmetsOfUser = appointmentSevice.getAppointmentByUserId(userId);
        }
    %>
    
   <div class="container mt-4">
    <div class="row">
        <% 
        if (appointmetsOfUser != null && !appointmetsOfUser.isEmpty()) {
            for (Appointment appointment : appointmetsOfUser) {
            DoctorDao ddao=new DoctorDao(DBConnect.getConnection());
            Doctor doctor=ddao.getDoctorbyId(appointment.getDoctorId());
        %>
        <div class="col-md-6 mb-4">
            <div class="c ard appointment-card">
                <div class="card-body">
                    <h5 class="card-title mb-3">My Appointment</h5>
                    <p class="card-text"><span class="label">Doctor:</span> <span class="value"><%= appointment.getDoctorName() %></span></p>
                    <p class="card-text"><span class="label">Date:</span> <span class="value"><%= appointment.getAppointmentDate() %></span></p>
                    <p class="card-text"><span class="label">Slot:</span> <span class="value"><%= appointment.getSlot() %></span></p>
                    <div class="form-group">
                        <label for="comment">Comment:</label>
                        <textarea class="form-control" rows="4" id="comment" readonly><%= appointment.getComment() != null ? appointment.getComment() : "No Comment" %></textarea>
                    </div>
                    <button type="button"  id="virtualMeet" onclick="redirectToVirtualDoctor('<%= doctor.getLink() %>')" class="btn btn-primary btn-block" <%= appointment.getisLinkInvite() != false ? "" : "disabled" %>>
                        JOIN VIRTUAL DOCTOR
                    </button>
                     <script>
						    function redirectToVirtualDoctor(link) {
						        window.location.href = link;
						    }
-                    </script>
                </div>
            </div>
        </div>
        <% 
            }
        } else {
        %>
        <div class="col">
            <div class="alert alert-warning" role="alert">
                No appointments found.
            </div>
        </div>
        <% } %>
    </div>
</div>
   
     <script>
        function redirectToVirtualDoctor(link) {
            window.location.href = link;
        }
    </script>
    
</body>
</html>

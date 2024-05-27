package com.virtusa.Controller.doctorServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.DBConnect;
import com.virtusa.dao.AppointmentDao;
import com.virtusa.dao.DoctorDao;
import com.virtusa.entity.Appointment;
import com.virtusa.entity.Doctor;

@WebServlet("/SendMeetLinkToAppointment")
public class SendMeetLinkToAppointment extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		
		Doctor d=(Doctor)req.getSession().getAttribute("doctorObj");
		int doctorId=d.getDoctorId();
		DoctorDao ddao=new DoctorDao(DBConnect.getConnection());
		d=ddao.getDoctorbyId(doctorId);
		if(d.getLink()==null) {
			req.getRequestDispatcher("doctor/UpdateMeetLink.jsp").forward(req, resp);
		}else {
			int appointmentId=Integer.parseInt(req.getParameter("appointmentId"));
			AppointmentDao adao=new AppointmentDao(DBConnect.getConnection());
			boolean f=adao.updateSendLinkToTrue(appointmentId);
			if(f) {
				  session.setAttribute("SuccessLink", "Invite sent");
			}else {
				  session.setAttribute("SuccessLink", "Not invited");
			}
			
		        AppointmentDao ap = new AppointmentDao(DBConnect.getConnection());
		        ArrayList<Appointment> appointmentArrayList = ap.appointmentsToAttend(doctorId);
		       
		        req.setAttribute("appointments", appointmentArrayList);
		        req.getRequestDispatcher("doctor/PendingAppointment.jsp").forward(req, resp);
		}
	}
		

}

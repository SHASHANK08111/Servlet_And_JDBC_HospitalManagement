package com.virtusa.Controller.userServlet;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.DBConnect;
import com.virtusa.Service.AppointmentService;
import com.virtusa.dao.AppointmentDao;
import com.virtusa.dao.DoctorDao;
import com.virtusa.entity.Appointment;
import com.virtusa.entity.Doctor;
import com.virtusa.entity.User;

@WebServlet("/saveAppointment")
public class saveAppointment extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  try {
	
            
	        String slot = req.getParameter("slot");

	        HttpSession appointmentSession = req.getSession();
	        HttpSession session = req.getSession();
	        Appointment ap = (Appointment) appointmentSession.getAttribute("appointmentObj");
	        ap.setComment("Not Updated");
	        ap.setSlot(slot);
	        //AppointmentDao adao=new AppointmentDao(DBConnect.getConnection());
			AppointmentService appointmentService=new AppointmentService(DBConnect.getConnection());
			System.out.println(ap.getDisease());
	        boolean f=appointmentService.saveAppointmentToDB(ap);
	        if(f){
                session.setAttribute("succMsg", "Appointment Added Successfully");
                resp.sendRedirect("user/BookAppointment.jsp");
                session.removeAttribute("appointmentObj");
            }
            else{
                session.setAttribute("errorMsg", "Book again with Correct details");
                resp.sendRedirect("user/BookAppointment.jsp");
            }
	        
	        
		  } catch (Exception e){
	            e.printStackTrace();
	        }
	}

}

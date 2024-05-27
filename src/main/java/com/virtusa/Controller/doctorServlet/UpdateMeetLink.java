package com.virtusa.Controller.doctorServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.DBConnect;
import com.virtusa.dao.DoctorDao;

@WebServlet("/UpdateMeetLink")
public class UpdateMeetLink extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session=req.getSession();
		 int doctorId = Integer.parseInt(req.getParameter("doctorId")); 
         String virtualMeetLink = req.getParameter("virtualMeetLink");
         System.out.println(doctorId);
         System.out.println(virtualMeetLink);
         
         DoctorDao ddao=new DoctorDao(DBConnect.getConnection());
         boolean f=ddao.updateDoctorMeetLink(doctorId, virtualMeetLink);
         if(f)  {
             session.setAttribute("succMsg", "Link updated");
             resp.sendRedirect("doctor/UpdateMeetLink.jsp");
         }else {
             session.setAttribute("errorMsg", "Error");
             resp.sendRedirect("doctor/UpdateMeetLink.jsp");

         }
	}
	
	

}

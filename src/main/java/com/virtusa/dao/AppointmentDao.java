package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entity.Appointment;

public class AppointmentDao {

	private Connection conn;
	
	public AppointmentDao(Connection conn) {
		this.conn=conn;
	}
	
	public boolean saveAppointmentToDB(Appointment ap) {
		Boolean f=false;
		if(ap.getSlot()==null || ap.getSlot().equals("null") || ap.getSlot().equals("--Select--")) {
			return f;
		}
		
		try {
			String sql="INSERT INTO appointment (userId, doctorId, username, age, disease, appointmentDate, slot, specialistName, doctorName, isLinkInvite, comment, consultationStatus) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, ap.getUserId());
			ps.setInt(2, ap.getDoctorId());
			ps.setString(3, ap.getUsername());
			ps.setInt(4, ap.getAge());
			ps.setString(5, ap.getDisease());
			ps.setDate(6,ap.getAppointmentDate());
			ps.setString(7, ap.getSlot());
			ps.setString(8, ap.getSpecialistName());
			ps.setString(9, ap.getDoctorName());
			ps.setBoolean(10, ap.getisLinkInvite());
			ps.setString(11, ap.getComment());
			ps.setString(12, ap.getConsultationStatus());
			
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return f;
	}

	
	
	
	public List<Appointment> getAppointmentByUserId(int userId1) {
		
		List<Appointment> appointmetsOfUser=new ArrayList<>();
		try {
			String sql="select * from appointment where userId=? ";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,userId1);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Appointment ap=new Appointment();
				ap.setAppointmentId(rs.getInt(1));
				ap.setUserId(rs.getInt("userId"));
			    ap.setDoctorId(rs.getInt("doctorId"));
			    ap.setUsername(rs.getString("username"));
			    ap.setAge(rs.getInt("age"));
			    ap.setDisease(rs.getString("disease"));
			    ap.setAppointmentDate(rs.getDate("appointmentDate"));
			    ap.setSlot(rs.getString("slot"));
			    ap.setSpecialistName(rs.getString("specialistName"));
			    ap.setDoctorName(rs.getString("doctorName"));
			    ap.setLinkInvite(rs.getBoolean("isLinkInvite"));
			    ap.setComment(rs.getString("comment"));
			    ap.setConsultationStatus(rs.getString("consultationStatus"));
			    appointmetsOfUser.add(ap);
				
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return appointmetsOfUser;
	}
	


	public ArrayList<Appointment> appointmentsToAttend(int doctorId1){
	       ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	       Appointment appointment = null;
	       try{
	          String sql = "SELECT * FROM appointment WHERE doctorId=? AND consultationStatus = ? AND appointmentDate >= ?";
	          PreparedStatement ps = conn.prepareStatement(sql);
	          ps.setInt(1, doctorId1);
	          ps.setString(2, "Not Completed");

	          java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

	          ps.setDate(3, sqlDate);
	          ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	             appointment = new Appointment();
	             appointment.setAppointmentId(rs.getInt(1));
	             appointment.setUserId(rs.getInt(2));
	             appointment.setDoctorId(rs.getInt(3));
	             appointment.setUsername(rs.getString(4));
	             appointment.setAge(rs.getInt(5));
	             appointment.setDisease(rs.getString(6));
	             appointment.setAppointmentDate(rs.getDate(7));
	             appointment.setSlot(rs.getString(8));
	             appointment.setSpecialistName(rs.getString(9));
	             appointment.setDoctorName(rs.getString(10));
	             appointment.setLinkInvite(rs.getBoolean(11));
	             appointment.setComment(rs.getString(12));
	             appointment.setConsultationStatus(rs.getString(13));


	             //appointment.setSpecialistName(rs.getString(2));
	             appointmentList.add(appointment);
	          }
	       }catch (Exception e){
	          e.printStackTrace();
	       }
	       return appointmentList;
	    }
	
	
	public boolean updateSendLinkToTrue(int appointmentId1) {
		//update column isApprove to true it will enable button in frontend to join meet
		Boolean f=false;
		
		
		try {
			String sql="update appointment set isLinkInvite=? where appointmentId=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setBoolean(1, true);
			ps.setInt(2, appointmentId1);
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return true;
	}

	
}

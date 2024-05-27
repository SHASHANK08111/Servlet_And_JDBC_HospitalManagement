package com.virtusa.entity;
import java.sql.Date;

public class Appointment {
	private int appointmentId;
    private int userId;
    private int doctorId;
    private String username;
    private int age;
    private String disease;
    private Date appointmentDate;
    private String slot;
    private String specialistName;
    private String doctorName;
    private boolean isLinkInvite;
    private String comment;
    private String consultationStatus;
    
    
	public Appointment() {
		super();
	}
	public Appointment(int userId, int doctorId, String username, int age, String disease,
			Date appointmentDate, String slot, String specialistName, String doctorName, boolean isLinkInvite,
			String comment, String consultationStatus) {
		super();
		this.userId = userId;
		this.doctorId = doctorId;
		this.username = username;
		this.age = age;
		this.disease = disease;
		this.appointmentDate = appointmentDate;
		this.slot = slot;
		this.specialistName = specialistName;
		this.doctorName = doctorName;
		this.isLinkInvite = isLinkInvite;
		this.comment = comment;
		this.consultationStatus = consultationStatus;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public String getSpecialistName() {
		return specialistName;
	}
	public void setSpecialistName(String specialistName) {
		this.specialistName = specialistName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public boolean getisLinkInvite() {
		return isLinkInvite;
	}
	public void setLinkInvite(boolean isLinkInvite) {
		this.isLinkInvite = isLinkInvite;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getConsultationStatus() {
		return consultationStatus;
	}
	public void setConsultationStatus(String consultationStatus) {
		this.consultationStatus = consultationStatus;
	}
    
    
    
    
    
	
}

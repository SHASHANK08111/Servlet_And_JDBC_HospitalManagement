package com.virtusa.entity;

import java.sql.Date;

public class Doctor {
    private int doctorId;
    private String fullname;
    private Date dob;
    private String qualification;
    private String specialist;
    private String email;

    private String mobNo;
    private String password;
    private String link;
    
    
    public Doctor(String fullname, Date dob, String qualification, String specialist, String email,
			String mobNo, String password, String link) {
		super();
		this.fullname = fullname;
		this.dob = dob;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
		this.link = link;
	}
	public Doctor() {
        super();
    }
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}


   
}


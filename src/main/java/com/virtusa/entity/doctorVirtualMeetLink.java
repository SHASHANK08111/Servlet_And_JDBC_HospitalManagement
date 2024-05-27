package com.virtusa.entity;

public class doctorVirtualMeetLink {
	int doctorId;
	String virtualMeetLink;
	
	
	public doctorVirtualMeetLink(int doctorId, String virtualMeetLink) {
		super();
		this.doctorId = doctorId;
		this.virtualMeetLink = virtualMeetLink;
	}

	public int getDoctorId() {
		return doctorId;
	}
	
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getVirtualMeetLink() {
		return virtualMeetLink;
	}
	public void setVirtualMeetLink(String virtualMeetLink) {
		this.virtualMeetLink = virtualMeetLink;
	}
	
}

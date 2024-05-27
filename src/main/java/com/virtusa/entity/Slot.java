package com.virtusa.entity;

public class Slot {
	
	int slotId;
	String slotTime;
	public Slot(String slotTime) {
		super();
		this.slotTime = slotTime;
	}
	
	public Slot() {
		super();
		
	}
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	public String getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}

}

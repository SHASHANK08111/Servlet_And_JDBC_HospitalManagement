package com.virtusa.entity;

public class Specialist {
    private int specialistId;
    private String specialistName;
    public Specialist(){
        super();
    }
    public Specialist(int specialistId, String specialistName) {
        this.specialistId = specialistId;
        this.specialistName = specialistName;
    }

    public int getSpecialistIdId() {
        return specialistId;
    }

    public void setId(int specialistId) {
        this.specialistId = specialistId;
    }

    public String getSpecialistName() {
        return specialistName;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName;
    }
}
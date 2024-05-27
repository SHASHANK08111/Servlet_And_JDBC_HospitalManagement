package com.virtusa.Service;

import com.virtusa.dao.DoctorDao;
import com.virtusa.entity.Doctor;

import java.sql.Connection;
import java.util.ArrayList;

public class DoctorService {

    private DoctorDao doctorDao;

    public DoctorService(Connection conn) {
        doctorDao = new DoctorDao(conn);
    }

    // Register a doctor
    public boolean registerDoctor(Doctor d) {
        return doctorDao.registerDoctor(d);
    }

    // Get all doctors
    public ArrayList<Doctor> getAllDoctors() {
        return doctorDao.getAllDoctors();
    }

    // Doctor login
    public Doctor doctorLogin(String email, String password) {
        return doctorDao.doctorLogin(email, password);
    }

    // Get all doctors by specialist
    public ArrayList<Doctor> getAllDoctorsBySpecialistName(String specialist) {
        return doctorDao.getAllDoctorsBySpecialistName(specialist);
    }

    // Get a doctor by ID
    public Doctor getDoctorById(int id) {
        return doctorDao.getDoctorbyId(id);
    }

    // Update doctor meet link
    public boolean updateDoctorMeetLink(int doctorId, String link) {
        return doctorDao.updateDoctorMeetLink(doctorId, link);
    }
}

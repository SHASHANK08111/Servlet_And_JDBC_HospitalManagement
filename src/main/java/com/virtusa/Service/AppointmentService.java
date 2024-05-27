package com.virtusa.Service;

import com.virtusa.dao.AppointmentDao;
import com.virtusa.entity.Appointment;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    private AppointmentDao appointmentDao;
    public AppointmentService(Connection conn) {
        this.appointmentDao=new AppointmentDao(conn);
    }

    public boolean saveAppointmentToDB(Appointment appointment) {
        if(Validation.isValidAppointmentDate(appointment.getAppointmentDate()) && Validation.isValidAge(appointment.getAge()) && Validation.isValidDisease(appointment.getDisease())){
            return appointmentDao.saveAppointmentToDB(appointment);
        }
        return false;
    }

    public List<Appointment> getAppointmentByUserId(int userId) {
        return appointmentDao.getAppointmentByUserId(userId);
    }

    public ArrayList<Appointment> getAppointmentsToAttendForDoctor(int doctorId) {
        return appointmentDao.appointmentsToAttend(doctorId);
    }

    public boolean updateLinkInviteStatus(int appointmentId) {
        return appointmentDao.updateSendLinkToTrue(appointmentId);
    }
}

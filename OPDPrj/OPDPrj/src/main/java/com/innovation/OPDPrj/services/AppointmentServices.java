package com.innovation.OPDPrj.services;

import java.util.List;

import com.innovation.OPDPrj.model.Appointment;

public interface AppointmentServices {
	Appointment insert(Appointment ap);
	void delete(long aid);
	Appointment update(long aid,Appointment ap);
	Appointment search(long aid);
	List<Appointment> getAll();
}

package com.innovation.OPDPrj.services;

import java.util.List;

import com.innovation.OPDPrj.model.Prescription;

public interface PrescriptionServices {
Prescription insert(Prescription ps);
	
	Prescription update(long pid,Prescription ps);
	Prescription search(long pid);
	List<Prescription> getAll();
	List<Prescription> getAllByApp(long aid);


}

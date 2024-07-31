package com.innovation.OPDPrj.services;

import java.util.List;

import com.innovation.OPDPrj.model.Patient;

	public interface PatientService
	{
		Patient insert(Patient p);
		void delete(long pid);
		Patient update(long pid,Patient p);
		Patient search(long pid);
		List<Patient> getAll();
		Patient login(String em,String ps);
}


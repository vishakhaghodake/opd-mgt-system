package com.innovation.OPDPrj.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPDPrj.model.Patient;
import com.innovation.OPDPrj.repository.PatientRepository;
@Service
public class PatientServicesImpl implements PatientService {
@Autowired
@Qualifier("patientRepo")
PatientRepository patientRepo;
	@Override
	public Patient insert(Patient p) {
		// TODO Auto-generated method stub
		return patientRepo.save(p);
	}

	@Override
	public void delete(long pid) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(pid);
	}

	@Override
	public Patient update(long pid, Patient p) {
		Optional<Patient> opt=patientRepo.findById(pid);
		if(opt.isPresent())
		{
			Patient pp=opt.get();
			pp.setName(p.getName());
			pp.setAddress(p.getAddress());
			pp.setGender(p.getGender());
			pp.setAge(p.getAge());
			pp.setContact(p.getContact());
			pp.setEmail(p.getEmail());
			pp.setPassword(p.getPassword());
		return patientRepo.save(pp);
		}
		return null;
	}

	@Override
	public Patient search(long pid) {
		Optional<Patient> opt=patientRepo.findById(pid);
		if(opt.isPresent())
		{
			Patient pp= opt.get();
			return pp;
					
		}
		return null;
	}

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

}

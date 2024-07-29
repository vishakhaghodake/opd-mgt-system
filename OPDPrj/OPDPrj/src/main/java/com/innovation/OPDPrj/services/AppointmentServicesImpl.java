package com.innovation.OPDPrj.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPDPrj.model.Appointment;
import com.innovation.OPDPrj.repository.AppointmentRepository;
@Service
public class AppointmentServicesImpl implements AppointmentServices {

	@Autowired
	@Qualifier("apRepo")
	AppointmentRepository apRepo;
	
	@Override
	public Appointment insert(Appointment ap) {
		// TODO Auto-generated method stub
		return apRepo.save(ap);
	}

	@Override
	public void delete(long aid) {
		apRepo.deleteById(aid);
		
	}

	@Override
	public Appointment update(long aid, Appointment ap) {
		Optional<Appointment> opt=apRepo.findById(aid);
		if(opt.isPresent())
		{
			Appointment app=opt.get();
			app.setCid(ap.getCid());
			app.setDt(ap.getDt());
			app.setStatus(ap.getStatus());
			app.setTm(ap.getTm());
		return apRepo.save(app);
		}
		return null;
	}

	@Override
	public Appointment search(long aid) {
		Optional<Appointment> opt=apRepo.findById(aid);
		if(opt.isPresent())
		{
			Appointment app=opt.get();
			
		return app;
		}
		return null;
	}

	@Override
	public List<Appointment> getAll() {
		
		return apRepo.findAll();
	}
	
	
	}

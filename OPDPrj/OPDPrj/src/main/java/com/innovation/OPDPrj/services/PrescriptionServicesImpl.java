package com.innovation.OPDPrj.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPDPrj.model.Prescription;
import com.innovation.OPDPrj.repository.PrescriptionRepository;
@Service
public class PrescriptionServicesImpl implements PrescriptionServices {
@Autowired
@Qualifier("presRepo")
PrescriptionRepository presRepo;
	@Override
	public Prescription insert(Prescription ps) {
		// TODO Auto-generated method stub
		return presRepo.save(ps);
	}

	@Override
	public Prescription update(long pid, Prescription ps) {
		Optional<Prescription> opt=presRepo.findById(pid);
		if(opt.isPresent())
		{
			Prescription pr=opt.get();
		    pr.setAid(ps.getAid());
		    pr.setMedicine(ps.getMedicine());
		    pr.setSuggestion(ps.getSuggestion());
		return presRepo.save(pr);
		}
		return null;
		
	}

	@Override
	public Prescription search(long pid) {
		Optional<Prescription> opt=presRepo.findById(pid);
		if(opt.isPresent())
		{
			Prescription pr=opt.get();
		return pr;
		}
		return null;
		
	}

	@Override
	public List<Prescription> getAll() {
		// TODO Auto-generated method stub
		return presRepo.findAll();
	}

}

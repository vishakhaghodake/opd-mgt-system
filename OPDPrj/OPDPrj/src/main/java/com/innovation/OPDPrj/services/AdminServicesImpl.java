package com.innovation.OPDPrj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.OPDPrj.model.Admin;
import com.innovation.OPDPrj.repository.AdminRepository;
@Service
public class AdminServicesImpl implements AdminServices{

	@Autowired
	@Qualifier("admRepo")
	AdminRepository admRepo;

	@Override
	public Admin login(String em, String ps) {
		// TODO Auto-generated method stub
		return admRepo.findByEmailAndPassword(em, ps);
	}
	
	

}
package com.innovation.OPDPrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.OPDPrj.model.Admin;
import com.innovation.OPDPrj.services.AdminServices;
@RestController
@RequestMapping("/opd/")

public class AdminController {
	@Autowired
	AdminServices as;
	
	
	
	

}

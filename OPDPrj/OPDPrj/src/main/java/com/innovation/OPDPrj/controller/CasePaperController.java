package com.innovation.OPDPrj.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.innovation.OPDPrj.model.Appointment;

public class CasePaperController {
	@PostMapping("/Appointment")
	public Appointment insert(@RequestBody Appointment p)
	{
		return as.insert(p);
	}
	@DeleteMapping("/Appointment/{id}")
	public void delete(@PathVariable("id")long id)
	{
		as.delete(id);
	}
	@PutMapping("/Appointment/{id}")
	public Appointment update(@PathVariable("id")long id,@RequestBody Appointment p)
	{
		return as.update(id, p);
	}
	@GetMapping("/Appointment/{id}")
	public Appointment search(@PathVariable("id")long id)
	{
		return as.search(id);
	}


}

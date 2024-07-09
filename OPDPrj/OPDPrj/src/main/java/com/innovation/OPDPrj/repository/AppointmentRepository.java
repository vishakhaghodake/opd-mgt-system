package com.innovation.OPDPrj.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.OPDPrj.model.Appointment;



@Repository
@Qualifier("apRepo")
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.reponse.TicketInfo;
import com.rest.request.PassengerInfo;

@RestController
public class AirIndiaRestController {
	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(PassengerInfo pinfo){
		
		//send ticket Info
		TicketInfo tinfo=new TicketInfo();
		tinfo.setName(pinfo.getFname()+" "+pinfo.getLname());
		tinfo.setFrom(pinfo.getFrom());
		tinfo.setTo(pinfo.getTo());
		tinfo.setTStatus("CONFIRMED");
		tinfo.setTPrice("450.00 INR");
		tinfo.setJDate(pinfo.getJDate());
		return new ResponseEntity<>(tinfo,HttpStatus.OK);
	}
}

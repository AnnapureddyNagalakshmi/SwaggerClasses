package com.rest.reponse;

import lombok.Data;

@Data
public class TicketInfo {

	private String name;
	private String from;
	private String to;
	private String flightId;
	private String jDate;
	private String tPrice;
	private String tStatus;
}

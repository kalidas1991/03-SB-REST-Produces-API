package in.com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.com.app.binding.Ticket;

@RestController
public class TicketRestController {

	@GetMapping(value = "/ticket/{ticketNum}" , produces = {"application/json", "application/xml"})
	public ResponseEntity<Ticket> getTicketInfo(@PathVariable String ticketNum){
		Ticket ticket = new Ticket();
		ticket.setFrom("Pune");
		ticket.setTo("Mumbai");
		ticket.setTicketId(18887);
		ticket.setTrainNumber(988888);
		ticket.setPrice(455.00);
		ticket.setJourneyDate("20-12-2022");
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
		
	}
}

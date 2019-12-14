package com.pluralsight.fundamentals.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.entity.Ticket;
import com.pluralsight.fundamentals.exception.ApplicationNotFoundException;
import com.pluralsight.fundamentals.service.ApplicationService;
import com.pluralsight.fundamentals.service.TicketService;

@RestController
@RequestMapping("/tza")
public class TzaRestController {

	@Autowired
	private ApplicationService applicationService;

	@Autowired
	private TicketService ticketService;

	@GetMapping("/applications")
	public ResponseEntity<List<Application>> getAllApplications() {
		List<Application> list = applicationService.listApplications();
		return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
	}

	@GetMapping("/tickets")
	public ResponseEntity<List<Ticket>> getAllTicket() {
		List<Ticket> list = ticketService.listTickets();
		return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
	}

	@GetMapping("/application/{id}")
	public ResponseEntity<Application> getAllApplication(@PathVariable("id") long id) {
		try {
			return new ResponseEntity<Application>(applicationService.findApplication(id), HttpStatus.OK);
		} catch (ApplicationNotFoundException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
		}
	}

}

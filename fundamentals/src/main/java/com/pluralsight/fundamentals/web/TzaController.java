package com.pluralsight.fundamentals.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pluralsight.fundamentals.service.ApplicationService;
import com.pluralsight.fundamentals.service.ReleaseService;
import com.pluralsight.fundamentals.service.TicketService;

@Controller
public class TzaController {

	@Autowired
	private ApplicationService applicationService;

	@Autowired
	private TicketService ticketService;

	@Autowired
	private ReleaseService releaseService;

	@GetMapping("/applications")
	public String retrieveApplications(Model model) {
		model.addAttribute("applications", applicationService.listApplications());
		return "applications";
	}

	@GetMapping("/tickets")
	public String retrieveTickets(Model model) {
		model.addAttribute("tickets", ticketService.listTickets());
		return "tickets";
	}

	@GetMapping("/releases")
	public String retrieveReleases(Model model) {
		model.addAttribute("releases", releaseService.listReleases());
		return "releases";
	}

}

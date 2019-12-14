package com.pluralsight.fundamentals.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.fundamentals.entity.Ticket;
import com.pluralsight.fundamentals.repository.TicketRepository;
import com.pluralsight.fundamentals.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public List<Ticket> listTickets() {
		return (List<Ticket>) ticketRepository.findAll();
	}
}

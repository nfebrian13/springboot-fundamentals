package com.pluralsight.fundamentals.repository;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamentals.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}

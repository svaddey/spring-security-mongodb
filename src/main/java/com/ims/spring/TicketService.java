package com.ims.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    private final Logger LOGGER = LoggerFactory.getLogger(TicketService.class);

    public void createTicket(Ticket ticket) {

        ticketRepository.createTicket(toTicketEntity(ticket));
    }

    private TicketEntity toTicketEntity(Ticket ticket) {
        TicketEntity ticketEntity = new TicketEntity();

        ticketEntity.setCreatedBy(ticket.getCreatedBy());
        ticketEntity.setCreatedDate(ticket.getCreatedDate());
        ticketEntity.setDescription(ticket.getDescription());
        ticketEntity.setId(ticket.getId());

        return ticketEntity;
    }
}

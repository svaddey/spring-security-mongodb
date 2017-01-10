package com.ims.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TicketController {

    @Autowired
    TicketService ticketService;

    private final Logger LOGGER = LoggerFactory.getLogger(TicketController.class);

    @RequestMapping(value = "/addTicket", method = RequestMethod.POST)
    public String createTicket(@ModelAttribute("ticket") Ticket ticket, BindingResult bindingResult, ModelMap model) {
        LOGGER.info("received request to for addTicket");
        ticketService.createTicket(ticket);

        return "tickets";
    }

    // TODO: Added to test the application, will be removed later
    @RequestMapping(value = "/addDefaultTicket", method =  RequestMethod.GET)
    public String checkTicket() {
        Ticket ticket = new Ticket();
        ticket.setId("id");
        ticket.setCreatedBy("user");
        ticket.setDescription("description");

        ticketService.createTicket(ticket);

        return "tickets";
    }
}

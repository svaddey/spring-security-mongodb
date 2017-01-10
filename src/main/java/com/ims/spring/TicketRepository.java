package com.ims.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class TicketRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    private final Logger LOGGER = LoggerFactory.getLogger(TicketRepository.class);

    public void createTicket(TicketEntity ticketEntity) {
        LOGGER.info("creating ticket");
        mongoTemplate.insert(Collections.singleton(ticketEntity), TicketEntity.class);
    }
}

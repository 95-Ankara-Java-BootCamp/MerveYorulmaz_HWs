package com.concertTicketSales.service.abstratcs;

import com.concertTicketSales.model.Event;

public interface BaseTicketSalesSystem {

    abstract void getTicketSales(Event event);
}

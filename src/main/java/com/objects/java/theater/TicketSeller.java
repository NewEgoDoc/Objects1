package com.objects.java.theater;

import com.objects.java.theater.domain.Audience;
import com.objects.java.theater.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TicketSeller {
    private TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        audience.buy(ticket);
    }


}

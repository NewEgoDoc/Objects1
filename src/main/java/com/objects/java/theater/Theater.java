package com.objects.java.theater;

import com.objects.java.theater.domain.Audience;
import com.objects.java.theater.domain.Ticket;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Theater {
    private TicketSeller ticketSeller;

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}

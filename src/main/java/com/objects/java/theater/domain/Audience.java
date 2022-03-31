package com.objects.java.theater.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Audience {
    private Bag bag;

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}

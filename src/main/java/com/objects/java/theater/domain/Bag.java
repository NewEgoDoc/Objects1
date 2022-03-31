package com.objects.java.theater.domain;


public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Bag(long amount){
        this(amount, null);
    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}

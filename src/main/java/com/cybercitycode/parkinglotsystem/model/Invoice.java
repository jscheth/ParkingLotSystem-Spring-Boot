package com.cybercitycode.parkinglotsystem.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Invoice {
    private String id;
    private Ticket ticket;
    private float amount;
    private LocalDateTime exitTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public float calculatePayment(Rates rateType) {
        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
        switch (rateType) {
            case HOURLY: return duration.toHours() * rateType.getRate();
            case DAILY: return duration.toDays() * rateType.getRate();
            case WEEKLY: return (duration.toDays() / 7) * rateType.getRate();
            case MONTHLY: return (duration.toDays() / 30) * rateType.getRate();
            default: return 0;
        }
    }
}

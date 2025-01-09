package com.example.flightease.models;

import java.io.Serializable;

public class Flight implements Serializable {
    private String airline, source, destination, time, price;

    public Flight(String airline, String source, String destination, String time, String price) {
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public String getTime() {
        return time;
    }

    public String getPrice() {
        return price;
    }
}

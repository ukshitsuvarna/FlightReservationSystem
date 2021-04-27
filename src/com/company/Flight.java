package com.company;

public class Flight {
    String flightNumber ;
    String airline;
    private int capacity;
    private int bookedSeats;

    public Flight() {
        this("AIR2548" , "IGI" , 300 , 250);
    }
    public Flight(String flightNumber , String airline , int capacity , int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public Flight (Flight flight) {
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight. capacity;
        this.bookedSeats = flight.bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return this.flightNumber;
    }

    public void incrementBookingCounter() {
        this.bookedSeats = 250;
    }

    public boolean checkAvailability() {
        return this.capacity < 300;
    }

    public boolean checkStatus() {
        return true;
    }
}

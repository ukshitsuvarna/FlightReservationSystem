package com.company;

public class RegularTicket extends Ticket {

    private String specialServices;
    private String SpecialServices;

    public RegularTicket(String pnr , String from , String to , Flight flight , String departureDateTime , String arrivalDateTime , Passenger passenger , String seatNo , float price , Boolean cancelled) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price,cancelled);
        this.specialServices = specialServices;
    }

    public RegularTicket(String guhhggf , String delhi , String agra , String air_india , String departureDateTime , String arrivalDateTime , String suresh) {
        super(guhhggf , delhi, agra, air_india, suresh);
    }

    String getSpecialServices() {
        return SpecialServices;
    }

    String updateSpecialServices(String specialServices) {
        return specialServices;
    }
}

package com.company;

public class Main {
    private static String pnr;

    public static void main(String[] args) {
            Flight flight = new Flight();
            flight.flightNumber = "2445";
            flight.airline= "AIR INDIA";
            System.out.println(flight.flightNumber);
            System.out.println(flight.airline);

            Ticket ticket=new RegularTicket(pnr);
            printTicketDetails(ticket);
        }

    private static void printTicketDetails(Ticket ticket) {
    }
}

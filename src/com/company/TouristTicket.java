package com.company;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] selectedTouristLocation;
    private String[] TouristLocations;


    public TouristTicket(String pnr , String from , String to , Flight flight , String departureDateTime , String arrivalDateTime , Passenger passenger , String seatNo , float price , Boolean cancelled , String hotelAddress) {
        super(pnr , from , to , flight , departureDateTime , arrivalDateTime , passenger , seatNo , price , cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];
    }

    public TouristTicket(String duubr , String delhi , String agra , String air_india , String departureDateTime , String arrivalDateTime , String ram) {
        super(duubr, delhi, agra,air_india );
    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocations() {
        return TouristLocations;
    }

    public String[] removeTouristLocations(String location) {
        return TouristLocations;
    }

    public String[] addTouristLocations(String location) {
        return TouristLocations;
    }
}

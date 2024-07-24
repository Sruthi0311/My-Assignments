package com.gflights.model;

public class BookingModel {
    private int bookingId;
    private String source;
    private String destination;
    private String ticketClass;
    private int noOfPassengers;
    private boolean roundTrip;
    BookingModel(int bookingId,String source,String destination,String ticketClass,int noOfPassengers,boolean roundTrip){
       this.bookingId=bookingId;
       this.source=source;
       this.destination=destination;
       this.ticketClass=ticketClass;
       this.noOfPassengers=noOfPassengers;
       this.roundTrip=roundTrip;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public boolean isRoundTrip() {
        return roundTrip;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

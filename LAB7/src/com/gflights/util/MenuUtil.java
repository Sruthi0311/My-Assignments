package com.gflights.util;

import com.gflights.model.BookingModel;

public class MenuUtil {
    public static BookingModel bookFlights(){
        System.out.println("Enter Booking Id : ");
        int bookingId = 1;
        BookingModel bookingModel = new BookingModel();
        bookingModel.setBookingId(bookingId);
        return bookingModel;
    }
}

package com.gflights.repository;
import com.gflights.model.BookingModel;

import java.util.ArrayList;
import java.util.List;
public class BookingRepository {
    List<BookingModel> bookingModelList = new ArrayList<BookingModel>();
    public void addBooking(BookingModel bookingModel) {
        bookingModelList.add(bookingModel);
        System.out.println("Saved booking :  " + bookingModel);
    }

    //        2. Display bookings
    public void displayBookings() {
        // iterate through the arraylist and display the bookings.
        // iterate through a map and display details
    }Cr
//        3. Search bookings by bookingId
//        4. update bookings
//        5. delete a booking
//        6. Create and handle BookingNotFoundException for both List and Map
//        7. Create and handle DuplicateBookingException if a duplicate key is added.
}
}

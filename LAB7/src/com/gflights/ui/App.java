package com.gflights.ui;
import com.gflights.model.BookingModel;
import com.gflights.repository.BookingRepository;
import com.gflights.util.MainMenuUtil;
import com.gflights.util.MenuUtil;
public class App {
    public static void main(String[]args){
        System.out.println( "Welcome to GFlights" );
        BookingRepository bookingRepository = new BookingRepository();
        int choice = MainMenuUtil.displayMainMenu();
        if(choice == 1) {
            BookingModel bookingModel = null;
            bookingModel = MenuUtil.bookFlights();

            bookingRepository.addBooking(bookingModel);
        }
    }
}


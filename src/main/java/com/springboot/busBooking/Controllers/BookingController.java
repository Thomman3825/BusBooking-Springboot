package com.springboot.busBooking.Controllers;

import com.springboot.busBooking.Services.BookingService;
import com.springboot.busBooking.schemas.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookTicket")
    public String booSeat(List<Booking> bookings){
        return bookingService.bookSeat(bookings);
    }

    @GetMapping ("/getTickets")
    public List<Booking> getTickets(){
        return bookingService.getTickets();
    }
    @DeleteMapping("removeBooking/{booking_id}")
    public String delete(@PathVariable int booking_id){
        return bookingService.delete(booking_id);
    }

}

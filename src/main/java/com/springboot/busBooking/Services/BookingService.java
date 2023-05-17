package com.springboot.busBooking.Services;

import com.springboot.busBooking.schemas.Booking;

import java.util.List;

public interface BookingService {

    String bookSeat(List<Booking> bookings);

    List <Booking> getTickets();

    String delete (int booking_id);
}

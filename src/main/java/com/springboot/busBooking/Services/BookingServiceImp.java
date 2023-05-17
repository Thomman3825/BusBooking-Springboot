package com.springboot.busBooking.Services;

import com.springboot.busBooking.Dao.BookingDao;
import com.springboot.busBooking.schemas.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookingServiceImp implements BookingService{
    @Autowired
    private BookingDao bookingDao;
    @Override
    public String bookSeat(List<Booking> bookings) {
        bookingDao.saveAll(bookings);
        return "Seat booked successfully";
    }

    @Override
    public List<Booking> getTickets() {
        return (List<Booking>) bookingDao.findAll();
    }

    @Override
    public String delete(int booking_id) {
        bookingDao.deleteById(booking_id);
        return "Seat Cancelled";
    }
}

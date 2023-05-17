package com.springboot.busBooking.Dao;

import com.springboot.busBooking.schemas.Booking;
import org.springframework.data.repository.CrudRepository;
public interface BookingDao extends CrudRepository<Booking,Integer> {
}

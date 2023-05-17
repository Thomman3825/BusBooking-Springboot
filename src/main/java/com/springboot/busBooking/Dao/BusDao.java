package com.springboot.busBooking.Dao;

import com.springboot.busBooking.schemas.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusDao extends CrudRepository<Bus,Integer> {
}

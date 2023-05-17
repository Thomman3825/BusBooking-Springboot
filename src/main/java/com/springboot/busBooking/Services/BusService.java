package com.springboot.busBooking.Services;

import com.springboot.busBooking.schemas.Bus;

import java.util.List;
import java.util.Optional;

public interface BusService {
    String addBus(List<Bus> Buses);

    List<Bus> getBuses();
    String removeBus(int bus_Number);
    String changeRoute(Bus busToBeUpdated);

    Optional<Bus> getBusById(int bus_number);

}

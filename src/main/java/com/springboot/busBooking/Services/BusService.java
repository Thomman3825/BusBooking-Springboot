package com.springboot.busBooking.Services;

import com.springboot.busBooking.schemas.Bus;

import java.util.List;

public interface BusService {
    String addBus(List<Bus> Buses);

    List<Bus> getBuses();
    String removeBus(int bus_number);
    String changeRoute(Bus busToBeUpdated);

}

package com.springboot.busBooking.Services;

import com.springboot.busBooking.Dao.BusDao;
import com.springboot.busBooking.schemas.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component

public class BusServiceImp implements BusService{
    @Autowired
    private BusDao busDao;
    @Override
    public String addBus(List<Bus> Buses) {
        busDao.saveAll(Buses);
        return "Bus added to app";
    }

    @Override
    public List<Bus> getBuses() {
        return (List<Bus>) busDao.findAll();
    }

    @Override
    public String removeBus(int bus_Number) {
        busDao.deleteById(bus_Number);
        return "Bus removed from app";
    }

    @Override
    public String changeRoute(Bus busToBeUpdated) {
        busDao.save(busToBeUpdated);
        return "Route changed";
    }

    @Override
    public Optional<Bus> getBusById(int bus_number) {
        return busDao.findById(bus_number);
    }


}

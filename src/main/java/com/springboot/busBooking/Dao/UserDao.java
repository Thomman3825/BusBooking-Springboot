package com.springboot.busBooking.Dao;

import com.springboot.busBooking.schemas.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}

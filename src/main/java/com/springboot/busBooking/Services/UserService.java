package com.springboot.busBooking.Services;
import com.springboot.busBooking.schemas.User;


import java.util.List;
import java.util.Optional;

public interface UserService {
    String addUser(List<User> Users );

    Optional<User> getUser(int user_id);
    String deleteUser(int user_id);


}

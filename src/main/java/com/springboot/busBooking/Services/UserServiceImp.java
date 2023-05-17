package com.springboot.busBooking.Services;

import com.springboot.busBooking.Dao.UserDao;
import com.springboot.busBooking.schemas.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
;
@Component

public class UserServiceImp implements UserService{
@Autowired
private UserDao userDao;
    @Override
    public String addUser(List<User> Users) {
        userDao.saveAll(Users);
        return "User added";
    }

    @Override
    public Optional<User> getUser(int user_id) {

        return (Optional<User>) userDao.findById(user_id);
    }


    @Override
    public String deleteUser(int user_id) {
        userDao.deleteById(user_id);
        return "User deleted";
    }
}

package com.example.facebookapi.services;

import com.example.facebookapi.models.User;
import com.example.facebookapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);


        user.setActive(true);
        user.setJoiningDate(dateTime);
        return userRepository.save(user);
    }

    public ArrayList<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(String userID) {
        return userRepository.findAllByUserID(userID);
    }

}

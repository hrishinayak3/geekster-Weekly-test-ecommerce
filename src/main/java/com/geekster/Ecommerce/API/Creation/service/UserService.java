package com.geekster.Ecommerce.API.Creation.service;

import com.geekster.Ecommerce.API.Creation.model.User;
import com.geekster.Ecommerce.API.Creation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Integer userId) {
        return userRepo.findById(userId).orElseThrow(() ->
                new NoSuchElementException("User not found"));
    }
}

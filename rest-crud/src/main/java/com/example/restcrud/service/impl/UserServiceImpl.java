package com.example.restcrud.service.impl;

import com.example.restcrud.entity.User;
import com.example.restcrud.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements com.example.restcrud.service.UserService {
    private UserRepository userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }
}

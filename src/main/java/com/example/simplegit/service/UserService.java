package com.example.simplegit.service;

import com.example.simplegit.model.UserDetails;
import com.example.simplegit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    UserDetails createUser(UserDetails user);
    UserDetails getUserById(Long id);
    List<UserDetails> getAllUsers();
    UserDetails updateUser(Long id, UserDetails user);
    void deleteUser(Long id);
}

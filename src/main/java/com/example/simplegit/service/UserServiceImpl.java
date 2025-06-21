package com.example.simplegit.service;

import com.example.simplegit.model.UserDetails;
import com.example.simplegit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

@Override
    public UserDetails createUser(UserDetails user){
        return userRepository.save(user);
    }
    @Override
    public UserDetails getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<UserDetails> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public UserDetails updateUser(Long id, UserDetails newUser) {
        return userRepository.findById(id).map(u -> {
            u.setName(newUser.getName());
            u.setEmail(newUser.getEmail());
            return userRepository.save(u);
        }).orElse(null);
    }
    @Override
   public  void deleteUser(Long id){
        userRepository.deleteById(id);
   }


}

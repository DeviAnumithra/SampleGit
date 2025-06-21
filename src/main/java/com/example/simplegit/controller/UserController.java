package com.example.simplegit.controller;

import com.example.simplegit.model.UserDetails;
import com.example.simplegit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

//    @PostMapping
//    public ResponseEntity<?> createUser(@RequestBody UserDetails user) {
//        try {
//            return ResponseEntity.ok(userService.createUser(user));
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).body("Error: " + e.getMessage());
//        }
//    }

    @PostMapping
    public UserDetails createUser(@RequestBody UserDetails user) {
        return userService.createUser(user);
    }


   @GetMapping("/{id}")
    public UserDetails getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
@GetMapping
    public List<UserDetails> getAllUsers(){
        return userService.getAllUsers();
    }
    @PutMapping("/{id}")
    public UserDetails updateUser(@PathVariable Long id, @RequestBody UserDetails user){
        return userService.updateUser(id,user);
    }
@DeleteMapping("/{id}")
    public  String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "User has been Deleted Sucessfully";
    }


}

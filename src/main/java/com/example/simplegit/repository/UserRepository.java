package com.example.simplegit.repository;


import com.example.simplegit.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends  JpaRepository<UserDetails,Long> {}



package com.example.simplegit.security;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
}
// src/main/java/com/example/springbootcrud/config/SecurityConfig.java


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // disable CSRF for postman/browser testing
                .authorizeHttpRequests()
                .anyRequest().permitAll(); // allow all endpoints without auth
        return http.build();
    }
}

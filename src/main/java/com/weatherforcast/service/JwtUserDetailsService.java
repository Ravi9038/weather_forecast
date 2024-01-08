package com.weatherforcast.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
    	
    	try {
    		if ("foolishuser".equals(username)) {
                return new User("foolishuser", "$2a$12$mDZpwdo2JajdH3snMK8rr.uISrnZHHUYd9bkJw7dc2yTnePtEH4Pe",
                        new ArrayList<>());
            } else {
            	System.out.println("user name and password is not matached");
            }
		} catch (Exception e) {
			System.out.println(" User name and password is not matched");
		}
    	return null;

    }
}

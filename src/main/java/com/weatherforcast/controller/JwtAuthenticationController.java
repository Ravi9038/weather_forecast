package com.weatherforcast.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weatherforcast.dto.AuthenticateResponseDto;
import com.weatherforcast.dto.AuthenticationRequestDto;
import com.weatherforcast.util.JwtTokenUtil;
@RestController
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequestDto authenticationRequest) throws Exception {

    	String token = "";
    	try {
    		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

    		token = jwtTokenUtil.generateToken(authenticationRequest.getUsername());

            return ResponseEntity.ok(new AuthenticateResponseDto(token));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("User Name and password is not matched");
		}
    }

    private void authenticate(String username, String password) throws Exception {
        try {
        	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

}
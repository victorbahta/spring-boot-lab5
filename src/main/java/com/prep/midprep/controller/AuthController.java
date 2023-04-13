package com.prep.midprep.controller;

import com.prep.midprep.domain.Users;
import com.prep.midprep.domain.dto.LoginRequest;
import com.prep.midprep.domain.dto.LoginResponse;
import com.prep.midprep.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authenticate")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody Users loginRequest) {
        var login = authService.login(loginRequest);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }

}

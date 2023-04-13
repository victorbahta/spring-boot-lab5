package com.prep.midprep.service;

import com.prep.midprep.domain.Users;
import com.prep.midprep.domain.dto.LoginRequest;
import com.prep.midprep.domain.dto.LoginResponse;
import com.prep.midprep.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthService {
    private UserDetailsService userDetailsService;
    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;
    public LoginResponse login(Users user) {
        Authentication authentication = null;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
            System.out.println("authentication: " + authentication.isAuthenticated());
        } catch (BadCredentialsException be) {
            throw new BadCredentialsException(be.getMessage());
        }

        final UserDetails userDetail = userDetailsService.loadUserByUsername(authentication.getName());
        final String accessToken = jwtUtil.generateToken(userDetail);
        return new LoginResponse(accessToken);

    }
}

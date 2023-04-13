package com.prep.midprep.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
public class LoginRequest {
    private String email;
    private String password;
}

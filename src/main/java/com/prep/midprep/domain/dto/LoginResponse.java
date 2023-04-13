package com.prep.midprep.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
    @AllArgsConstructor
//    @NoArgsConstructor
    @RequiredArgsConstructor
    public class LoginResponse {
        private String accessToken;
//        private String refreshToken;
    }


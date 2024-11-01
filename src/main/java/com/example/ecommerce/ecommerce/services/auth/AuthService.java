package com.example.ecommerce.ecommerce.services.auth;

import com.example.ecommerce.ecommerce.dto.SignUpRequest;
import com.example.ecommerce.ecommerce.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignUpRequest signUpRequest);
    Boolean hasUserWithEmail(String email);
}

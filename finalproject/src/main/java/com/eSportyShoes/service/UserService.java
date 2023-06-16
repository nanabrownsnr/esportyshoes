package com.eSportyShoes.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.eSportyShoes.entity.User;
import com.eSportyShoes.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	
}
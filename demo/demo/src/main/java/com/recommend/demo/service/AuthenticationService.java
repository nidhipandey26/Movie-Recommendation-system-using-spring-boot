package com.recommend.demo.service;

import com.recommend.demo.model.User;
import com.recommend.demo.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    AuthenticationRepository authenticationRepository;

    public void login(User user){
        authenticationRepository.findByUsername(user.getUsername());
    }




}

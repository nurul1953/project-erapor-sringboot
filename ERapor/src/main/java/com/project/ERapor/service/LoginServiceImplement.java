package com.project.ERapor.service;

import com.project.ERapor.model.Guru;
import com.project.ERapor.repositories.GuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImplement implements LoginService{
    @Autowired
    GuruRepository guruRepository;

    @Override
    public Guru login(String username, String password) {
        Guru guru = guruRepository.findByUsernameAndPassword(username, password);
        return guru;
    }
}

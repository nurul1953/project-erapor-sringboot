package com.project.ERapor.service;

import com.project.ERapor.dto.GuruDto;
import com.project.ERapor.model.Guru;

public interface LoginService {
    public Guru login(String username, String password);
}

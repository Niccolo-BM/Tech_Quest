package com.techQuest.TechQuest.service;


import com.techQuest.TechQuest.Application.dtos.reponse.AuthResponse;
import com.techQuest.TechQuest.Application.dtos.request.AuthRequest;

public interface IAuthService {
    public AuthResponse login(AuthRequest request);
}

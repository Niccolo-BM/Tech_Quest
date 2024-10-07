package com.techQuest.TechQuest.Application.service;


import com.techQuest.TechQuest.Api.Reponse.AuthResponse;
import com.techQuest.TechQuest.Api.Request.AuthRequest;

public interface IAuthService {
    public AuthResponse login(AuthRequest request);
}

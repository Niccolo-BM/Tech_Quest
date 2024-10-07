package com.techQuest.TechQuest.Api.Reponse;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class AuthResponse extends UserResponse{
    private String message; // validar y comprbar que los roles funcionen
    private String token;
}

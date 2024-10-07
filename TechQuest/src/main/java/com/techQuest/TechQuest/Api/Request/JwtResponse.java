package com.techQuest.TechQuest.Api.Request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class JwtResponse {
    private String token;
    public JwtResponse(String token) {
        this.token = token;
    }

}


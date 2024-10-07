package com.techQuest.TechQuest.Api.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthRequest {
    @NotBlank(message = "identifier required")
    private String identifier;

    @NotBlank(message = "password required")
    private String password;
}

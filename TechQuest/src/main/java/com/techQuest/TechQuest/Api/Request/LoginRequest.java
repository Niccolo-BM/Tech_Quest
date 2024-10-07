package com.techQuest.TechQuest.Api.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class LoginRequest {
    @NotBlank(message = "email required")
    @Email(message = "invalid format")
    private String email;

    @NotBlank(message = "password required")
    // @Pattern() 8min char - 1M - 1m - 1n - 1e
    private String password;
}


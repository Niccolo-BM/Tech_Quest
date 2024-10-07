package com.techQuest.TechQuest.Controllers;

import com.techQuest.TechQuest.Application.dtos.reponse.AuthResponse;
import com.techQuest.TechQuest.Application.dtos.request.AuthRequest;
import com.techQuest.TechQuest.service.IAuthService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@AllArgsConstructor
//@Tag(name = "Authentication", description = "Manages authentication requests.")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private final IAuthService authService;

    @PostMapping("login")
   /* @Operation(
            summary = "Authenticate a user.",
            description = "Provides a user's data to generate a token that allows them to use private endpoints if their role allows it.")*/
    public ResponseEntity<AuthResponse> login(
            @Validated @RequestBody AuthRequest request) {
        return ResponseEntity.ok(this.authService.login(request));
    }
}

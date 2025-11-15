package com.example.demo.controller;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

 @Autowired
  private  UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String user){
        return ResponseEntity.ok(userService.getUserProfile(userId  ));

    }
    @GetMapping("/register")
    public ResponseEntity<UserResponse> register(
            @Valid
            @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }


}






















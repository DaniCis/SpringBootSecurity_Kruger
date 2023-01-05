package com.kruger.oauthresource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/api/users")
    public String[] getUser() {
        return new String[]{"Daniela", "Nikhil","Shivam"};
    }
}

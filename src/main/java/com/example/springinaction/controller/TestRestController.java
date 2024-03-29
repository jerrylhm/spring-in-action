package com.example.springinaction.controller;

import com.example.springinaction.security.entity.User;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestRestController {

    @RequestMapping("/play")
    public String play(Principal principal) {
        return principal.getName();
    }

}

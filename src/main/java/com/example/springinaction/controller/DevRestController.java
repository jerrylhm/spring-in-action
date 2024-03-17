package com.example.springinaction.controller;

import com.example.springinaction.security.entity.User;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Profile("dev")
public class DevRestController {

    @RequestMapping("/dev")
    public Object dev(@AuthenticationPrincipal User user) {
        return user;
    }

}

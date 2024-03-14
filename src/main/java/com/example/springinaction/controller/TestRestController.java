package com.example.springinaction.controller;

import com.example.springinaction.domain.UpdateGroup;
import com.example.springinaction.domain.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping("/play")
    public String play(@Validated(UpdateGroup.class) User user) {
        return "play!";
    }

}

package com.example.springinaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

}

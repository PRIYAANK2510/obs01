package com.wipro.obs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//i dont know
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
}

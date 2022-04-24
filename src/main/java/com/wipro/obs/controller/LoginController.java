package com.wipro.obs.controller;


import com.wipro.obs.entity.UserCredentials;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    /*@PostMapping("/login")
    public String verify(@RequestBody UserCredentials user)
    {
    }*/
}

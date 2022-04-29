package com.wipro.obs.controller;


import com.wipro.obs.entity.UserCredentials;
import com.wipro.obs.model.UserCredModel;
import com.wipro.obs.validator.LoginValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @Autowired
    LoginValidation loginValidation;
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @PostMapping("/login")
    public String verify(@RequestBody UserCredModel userCredModel)
    {
        String userType = loginValidation.authenticate(userCredModel);
        return userType;
    }
}

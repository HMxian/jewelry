package com.example.jewelry.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/login")
    public String login () {
        return "page/login-1";
    }

    @RequestMapping("/login2")
    public String login2 () {
        return "page/login-2";
    }
}

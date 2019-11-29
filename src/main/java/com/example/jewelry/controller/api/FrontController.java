package com.example.jewelry.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrontController {

    @RequestMapping("/")
    public String index () {
        return "front/index";
    }

    @RequestMapping("/404")
    public String error404 () {
        return "front/404";
    }
}

package com.solera.questionaire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {return "All welcome!";}

    @GetMapping("/user")
    public String user() {return "User welcome!";}

    @GetMapping("/admin")
    public String admin() {return "Admin welcome!";}
}

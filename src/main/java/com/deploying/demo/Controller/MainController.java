package com.deploying.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String main1()
    {

        return "Hello World ";
    }
    @GetMapping("/home")
    public String home()
    {
        return "welcome home";
    }
}

package com.developer.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(path = "/welcome")
    public String welcome(){
        return "home";
    }
}

package com.auth.AuthDemoJWT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return "This is Admin Page";
    }
}

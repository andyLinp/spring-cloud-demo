package com.andy.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hi")
    public String sayHi(String s){
        return "Client : Helloooooo!"+s;
    }
}

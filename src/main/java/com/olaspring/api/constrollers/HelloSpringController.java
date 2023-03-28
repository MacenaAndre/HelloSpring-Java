package com.olaspring.api.constrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class HelloSpringController {

    @GetMapping
    public String helloSpring() {
        return "Hello Spring";
    }
    
}

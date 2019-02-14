package com.company;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(name = "/")
    public String helloWorld(){
        return "Hello World";
    }

}

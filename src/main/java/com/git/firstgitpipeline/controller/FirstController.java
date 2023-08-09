package com.git.firstgitpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return "Hi " + name + ", how are you doing?";
    }
}

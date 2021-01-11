package com.spring.cloud.eureka.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

    @GetMapping("users/{user}")
    public String getUser(@PathVariable("user") String user) {
        return "test" + user;
    }

}

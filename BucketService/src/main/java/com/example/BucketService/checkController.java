package com.example.BucketService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
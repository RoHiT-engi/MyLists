package com.rohit.ListingService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class checkController {
    
    @RequestMapping("/ms2")
    public String requestMethodName() {
        return "hello";
    }
    
}

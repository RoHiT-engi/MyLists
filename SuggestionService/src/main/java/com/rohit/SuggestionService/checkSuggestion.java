package com.rohit.SuggestionService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class checkSuggestion {
    @RequestMapping("/ms3")
    public String requestMethodName() {
        return "new String()";
    }

}

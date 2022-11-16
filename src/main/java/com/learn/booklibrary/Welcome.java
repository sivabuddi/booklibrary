package com.learn.booklibrary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @Value("${spring.message}")
    private String notes;

    @GetMapping("/testing")
    public String getMessage(){
        return notes;
    }


}

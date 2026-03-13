package com.codequest.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LevelController {

    @GetMapping("/levels")
    public String getlevels() {
     return("Level 1 - Hello World");
        
    }

}

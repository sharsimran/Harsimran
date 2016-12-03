package com.mockii.controller;

/**
 * Created by Billa on 12/3/16.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Mockii!";
    }

}
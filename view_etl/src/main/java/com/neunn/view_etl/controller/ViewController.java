package com.neunn.view_etl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ViewController {
    @RequestMapping("/hello")
    private String index(){
        return "helloworld";
    }
}

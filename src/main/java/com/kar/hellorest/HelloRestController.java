package com.kar.hellorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Rest!!!";
    }

    @GetMapping("/hey")
    public String hey(){
        return "Hey there!";
    }

    @GetMapping("/hello_v2")
    public String hello_v2(){
        return "Hello World from v2";
    }
}

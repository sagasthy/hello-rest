package com.kar.hellorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Rest!!!";
    }
    
    @GetMapping("/hello_v2")
    public String hello_v2(){
        return "Hello World from v2";
    }
}

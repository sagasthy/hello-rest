package com.kar.hellorest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloRestController {

//    @Autowired
//    NameRepository nameRepository;

    @RequestMapping(value = {"/hello", "/hello{id}"}, method = RequestMethod.GET)
    public String hello(@PathVariable Optional<String> name){
        if(name.isPresent()) {
            //nameRepository.save(new Name(name.get()));
            return "Hello " + name + "!";
        }

        return "Hello Stranger!";
    }

}

package com.andres.curso.springboot.app.aop.springboot_aop.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.andres.curso.springboot.app.aop.springboot_aop.services.GreetingService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class GreetingController {

    @Autowired
    private GreetingService greeting;

    @GetMapping("/greeting")
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.ok(Collections.singletonMap("greeting", 
            greeting.sayHello("Eduardo", "Hola, qué tal")));
    }
    

}

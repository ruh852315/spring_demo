package com.edusol.springdemo.controller;

import com.edusol.springdemo.dto.Customer;
import com.edusol.springdemo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/edu")
@Slf4j
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/get")
    public ArrayList helloWorld(){

        log.info("Inside controller");
        log.info("getting customer data");
        return testService.getHelloWorld();
    }
}

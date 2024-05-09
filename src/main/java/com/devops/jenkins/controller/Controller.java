package com.devops.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to Devops Assignment";
    }

    @RequestMapping(value = "/even", method = RequestMethod.GET)
    public Integer generateEvenNumbers() {
        List<Integer> resList = IntStream.range(0, 100).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        return resList.size();
    }
}

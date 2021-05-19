package com.example.h2demo.controller;

import com.example.h2demo.entity.Billionaires;
import com.example.h2demo.service.BilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/")
public class BilController {

    @Autowired
    BilService service;

    @GetMapping(path = "/get/{id}")
    public Billionaires get(@PathVariable("id") Integer id){
        return service.get(id);
    }

    @PostMapping("/post")
    public Billionaires post(@RequestBody Billionaires billionaires){
        return service.post(billionaires);
    }
}

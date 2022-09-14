package com.example.feignTest.controller;

import com.example.feignTest.interfaces.BankFeign;
import com.example.feignTest.model.Banks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "banks")
public class BankResource {
    private final BankFeign bankFeign;

    public BankResource(BankFeign bankFeign) {
        this.bankFeign = bankFeign;
    }

    @GetMapping(path = "/all")
    public List<Banks>findAllBanks(){
        return bankFeign.findBanks();
    }

    @GetMapping(path = "find/{code}")
    public Banks findByCode(@PathVariable("code")Long code){
        return bankFeign.findByCode(code);
    }
}

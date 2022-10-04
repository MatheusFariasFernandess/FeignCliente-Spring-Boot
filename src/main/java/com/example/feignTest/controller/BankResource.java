package com.example.feignTest.controller;

import com.example.feignTest.interfaces.BankFeign;
import com.example.feignTest.model.Banks;
import com.example.feignTest.model.Beer;
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

    @GetMapping("/find/all")
    public List<Banks>findAllBanks(){



        return bankFeign.findBanks();
        
    }

    @GetMapping("/find/{code}")
    public Banks findByCode(@PathVariable("code")Integer code){

        Banks banks = new Banks();


        return bankFeign.findByCode(code);
    }
}

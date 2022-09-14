package com.example.feignTest.interfaces;

import com.example.feignTest.model.Banks;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "Bank" , url = "https://brasilapi.com.br/api")
public interface BankFeign {

    @GetMapping("banks/v1")
    List<Banks> findBanks();

    @GetMapping("banks/v1/{code}")
    Banks findByCode(Long code);


}

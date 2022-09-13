package com.example.feignTest.interfaces;

import com.example.feignTest.model.feignModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "post" , url= "https://jsonplaceholder.typicode.com")
public interface FeignTestInterface {

    @GetMapping("{id}")
     feignModel findById(Long id);


    @GetMapping("/posts")
    List<feignModel>findAll();
}
package com.example.feignTest.controller;

import com.example.feignTest.interfaces.FeignTestInterface;
import com.example.feignTest.model.feignModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class feignController {

    private final FeignTestInterface feignTestInterface;

    public feignController(FeignTestInterface feignTestInterface) {
        this.feignTestInterface = feignTestInterface;
    }

    @GetMapping
    public List<feignModel> findAll(){
        return  feignTestInterface.findAll();
    }

}

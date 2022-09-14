package com.example.feignTest.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "comments" , url = "https://jsonplaceholder.typicode.com/")
public interface CommentsFeign {


    @GetMapping("comments")
    List<CommentsFeign>findAll();


}

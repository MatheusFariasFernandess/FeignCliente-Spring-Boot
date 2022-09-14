package com.example.feignTest.interfaces;

import com.example.feignTest.model.Comments;
import com.example.feignTest.model.Posts;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "feignTest" , url= "https://jsonplaceholder.typicode.com")
public interface PostFeign {

//    @GetMapping(value = "posts")
    @GetMapping(value = "posts")
    List<Posts>getAllPost();

    @GetMapping(value = "comments")
    List<Comments>getAllComments();
}
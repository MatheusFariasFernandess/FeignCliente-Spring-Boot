package com.example.feignTest.controller;

import com.example.feignTest.interfaces.PostFeign;
import com.example.feignTest.model.Posts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostResources {

    private PostFeign postFeign;

    public PostResources(PostFeign postFeign) {
        this.postFeign = postFeign;
    }

    @GetMapping
    public List<Posts> findAll(){
        return  postFeign.getAllPost();
    }

}

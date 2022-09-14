package com.example.feignTest.controller;

import com.example.feignTest.interfaces.PostFeign;
import com.example.feignTest.model.Comments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("messages")
public class CommentsResource {

    private final PostFeign postFeign;


    public CommentsResource(PostFeign postFeign) {
        this.postFeign = postFeign;
    }

    @GetMapping("/all")
    public List<Comments> findAll(){
        return postFeign.getAllComments();
    }
}

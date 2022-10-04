package com.example.feignTest.controller;

import com.example.feignTest.interfaces.BeerFeign;
import com.example.feignTest.model.Beer;
import org.springframework.graphql.data.GraphQlRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("beers/")
@RestController
public class BeerResources {

    private final BeerFeign beerFeign;

    public BeerResources(BeerFeign beerFeign) {
        this.beerFeign = beerFeign;
    }

    @GetMapping("/find/{id}")
    public List<Beer>findAll(@PathVariable("id") Integer id){
        return beerFeign.findById(id);
    }

    @GetMapping("/find/random")
    public List<Beer>findRandom(){
        return beerFeign.findRandom();
    }

    @GetMapping("/find/all")
    public List<Beer>findAll(){
        return beerFeign.findAll();
    }
}

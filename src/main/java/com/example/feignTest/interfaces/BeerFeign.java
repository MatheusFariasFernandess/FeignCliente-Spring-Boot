package com.example.feignTest.interfaces;

import com.example.feignTest.model.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Beer",url = "https://api.punkapi.com/v2/beers")
public interface BeerFeign {


    @GetMapping(value = "random")
    List<Beer>findRandom();

    @GetMapping(value = "/{id}")
    List<Beer>findById(@PathVariable("id") Long id);
}

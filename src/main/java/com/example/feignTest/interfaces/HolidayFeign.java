package com.example.feignTest.interfaces;

import com.example.feignTest.model.Holidays;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "holiday" , url = "https://api.invertexto.com/v1/holidays/")
public interface HolidayFeign {

    @GetMapping("/{year}")
    List<Holidays> findAll(@PathVariable("year") String year,@RequestParam("token")String token);



}

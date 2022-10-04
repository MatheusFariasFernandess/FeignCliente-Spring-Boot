package com.example.feignTest.controller;

import com.example.feignTest.interfaces.HolidayFeign;
import com.example.feignTest.model.Holidays;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

    private final HolidayFeign holidayFeign;

    public HolidayController(HolidayFeign holidayFeign) {
        this.holidayFeign = holidayFeign;
    }

    @GetMapping("/find/{year}")
    public List<Holidays>findAllHolidays(@PathVariable("year") String year,
                                         @RequestParam("token") String token){

        return holidayFeign.findAll(year,token);

    }
}

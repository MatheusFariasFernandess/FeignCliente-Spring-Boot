package com.example.feignTest.controller;

import com.example.feignTest.interfaces.FeriadosFeign;
import com.example.feignTest.model.Feriados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feriados")
public class FeriadosResource {

    private final FeriadosFeign feriadosFeign;

    public FeriadosResource(FeriadosFeign feriadosFeign) {
        this.feriadosFeign = feriadosFeign;
    }

    @GetMapping("/find/{ano}")
    public List<Feriados> findByAno(@PathVariable("ano") Integer ano){
        return feriadosFeign.findByAno(ano);
    }
}

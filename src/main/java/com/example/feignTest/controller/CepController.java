package com.example.feignTest.controller;

import com.example.feignTest.interfaces.CepFeign;
import com.example.feignTest.model.Cep;
import org.springframework.nativex.hint.AotProxyHint;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brazil-cep")
public class CepController {

    private final CepFeign cepFeign;


    public CepController(CepFeign cepFeign) {
        this.cepFeign = cepFeign;

    }

    @GetMapping("/find/{cep}")
    public Cep findCep(@PathVariable("cep") Integer cep){
        return cepFeign.find(cep);
    }
}

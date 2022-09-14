package com.example.feignTest.controller;

import com.example.feignTest.interfaces.CepFeign;
import com.example.feignTest.model.Cep;
import org.springframework.nativex.hint.AotProxyHint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brazil-cep")
public class CepController {

    private final CepFeign cepFeign;


    public CepController(CepFeign cepFeign) {
        this.cepFeign = cepFeign;

    }

    @GetMapping("/{cep}")
    public List<Cep>findAllCep(@PathVariable("cep") Integer cep){
        return cepFeign.findAllCep(cep);
    }
}

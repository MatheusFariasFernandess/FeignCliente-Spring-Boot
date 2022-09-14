package com.example.feignTest.interfaces;

import com.example.feignTest.model.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "CEP",url = "https://brasilapi.com.br/api/")
public interface CepFeign {

    @GetMapping("/cep/v1/{cep}")
    List<Cep>findAllCep(Integer cep);

}

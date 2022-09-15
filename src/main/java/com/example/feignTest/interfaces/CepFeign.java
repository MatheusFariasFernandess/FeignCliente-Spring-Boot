package com.example.feignTest.interfaces;

import com.example.feignTest.model.Cep;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CEP",url = "https://brasilapi.com.br/api/")
public interface CepFeign {

    @GetMapping("cep/v1/{cep}")
    Cep find(@PathVariable("cep") Integer cep);

}

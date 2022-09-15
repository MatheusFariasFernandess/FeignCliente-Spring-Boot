package com.example.feignTest.interfaces;

import com.example.feignTest.model.Feriados;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feriados",url = "https://brasilapi.com.br/api/feriados/v1")
public interface FeriadosFeign {

    @GetMapping("/{ano}")
    List<Feriados> findByAno(@PathVariable("ano") Integer ano);
}

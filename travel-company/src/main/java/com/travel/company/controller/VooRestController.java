package com.travel.company.controller;

import com.travel.company.dto.Voos;
import com.travel.company.service.VooService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("voo")
public class VooRestController {
    @Autowired
    private VooService vooService;

    @ApiOperation(value = "Pesquisa voos por data, origem e destino.",
            httpMethod = "GET")
    @GetMapping("/pesquisar")
    public List<Voos> pesquisar(@RequestParam("data") String data,
                                @RequestParam("origem") String origem,
                                @RequestParam("destino") String destino){
        return vooService.pesquisarVoo( data, origem, destino );
    }
}

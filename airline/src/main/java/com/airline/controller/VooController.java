package com.airline.controller;

import com.airline.dto.SimpleVooDto;
import com.airline.dto.VooDto;
import com.airline.model.Voo;
import com.airline.service.AbstractService;
import com.airline.service.VooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("voo")
public class VooController extends AbstractRestController<Voo, VooDto>{
    @Autowired
    private VooService service;

    @Override
    protected AbstractService<Voo, VooDto> service() {
        return this.service;
    }

    @GetMapping("/pesquisar")
    public List<SimpleVooDto> pesquisar(@RequestParam("data") String data,
                                        @RequestParam("origem") String origem,
                                        @RequestParam("destino") String destino,
                                        @RequestParam("limit") int limit,
                                        @RequestParam("page") int page){
        return service.pesquisarVoos( data, origem, destino, limit, page );
    }
}

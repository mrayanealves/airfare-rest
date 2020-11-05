package com.airline.controller;

import com.airline.dto.AviaoDto;
import com.airline.model.Aviao;
import com.airline.service.AbstractService;
import com.airline.service.AviaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aviao")
public class AviaoController extends AbstractRestController<Aviao, AviaoDto> {
    @Autowired
    private AviaoService service;

    @Override
    protected AbstractService<Aviao, AviaoDto> service() {
        return this.service;
    }
}

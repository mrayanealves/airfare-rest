package com.airline.controller;

import com.airline.dto.VooDto;
import com.airline.model.Voo;
import com.airline.service.AbstractService;
import com.airline.service.VooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("voo")
public class VooController extends AbstractRestController<Voo, VooDto>{
    @Autowired
    private VooService service;

    @Override
    protected AbstractService<Voo, VooDto> service() {
        return this.service;
    }
}

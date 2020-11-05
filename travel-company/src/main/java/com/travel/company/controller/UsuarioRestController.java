package com.travel.company.controller;

import com.travel.company.dto.UsuarioDto;
import com.travel.company.model.Usuario;
import com.travel.company.service.AbstractService;
import com.travel.company.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioRestController extends AbstractRestController<Usuario, UsuarioDto> {
    @Autowired
    private UsuarioService service;

    @Override
    protected AbstractService<Usuario, UsuarioDto> service() {
        return this.service;
    }
}

package com.airline.controller;

import com.airline.model.Usuario;
import com.airline.service.UsuarioService;
import com.airline.dto.UsuarioDto;
import com.airline.service.AbstractService;
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

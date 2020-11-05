package com.travel.company.service;

import com.travel.company.dto.UsuarioDto;
import com.travel.company.model.Usuario;
import com.travel.company.repository.GeneticRepository;
import com.travel.company.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends AbstractService<Usuario, UsuarioDto>{
    @Autowired
    private UsuarioRepository repository;

    @Override
    protected GeneticRepository<Usuario> repository() {
        return this.repository;
    }

    @Override
    protected UsuarioDto convertToDto(Usuario entity) {
        return modelMapper.map(entity, UsuarioDto.class);
    }

    @Override
    protected Usuario convertToEntity(UsuarioDto dto) {
        return modelMapper.map(dto, Usuario.class);
    }
}

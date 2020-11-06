package com.airline.service;

import com.airline.dto.VooDto;
import com.airline.model.Voo;
import com.airline.repository.GeneticRepository;
import com.airline.repository.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VooService extends AbstractService<Voo, VooDto>{
    @Autowired
    private VooRepository repository;

    @Override
    protected GeneticRepository<Voo> repository() {
        return this.repository;
    }

    @Override
    protected VooDto convertToDto(Voo entity) {
        return modelMapper.map(entity, VooDto.class);
    }

    @Override
    protected Voo convertToEntity(VooDto dto) {
        return modelMapper.map(dto, Voo.class);
    }
}

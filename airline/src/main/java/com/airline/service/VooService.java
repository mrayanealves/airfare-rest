package com.airline.service;

import com.airline.dto.VooDto;
import com.airline.dto.VooPesquisaDto;
import com.airline.model.Voo;
import com.airline.repository.GeneticRepository;
import com.airline.repository.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VooService extends AbstractService<Voo, VooDto>{
    @Autowired
    private VooRepository repository;

    @Override
    protected GeneticRepository<Voo> repository() {
        return this.repository;
    }

    public List<VooPesquisaDto> pesquisarVoos(int limit, int page, String data, String origem, String destino){
        return null;
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

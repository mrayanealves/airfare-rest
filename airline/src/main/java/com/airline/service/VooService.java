package com.airline.service;

import com.airline.dto.VooDto;
import com.airline.dto.SimpleVooDto;
import com.airline.model.Voo;
import com.airline.repository.GeneticRepository;
import com.airline.repository.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VooService extends AbstractService<Voo, VooDto>{
    @Autowired
    private VooRepository repository;

    @Autowired
    private AssentoService assentoService;

    @Override
    protected GeneticRepository<Voo> repository() {
        return this.repository;
    }

    public List<SimpleVooDto> pesquisarVoos(String data, String origem, String destino,
                                            int limit, int page){
        List<SimpleVooDto> simpleVoos = repository.findVoo( data, origem, destino, limit, page ).stream()
                .map( this::convertToSimpleDto ).collect( Collectors.toList() );

        simpleVoos.forEach( simpleVooDto ->
                simpleVooDto.setAssentosDisponiveis( assentoService.getAssentosDisponiveis( simpleVooDto.getId() ) ) );

        return simpleVoos;
    }

    private SimpleVooDto convertToSimpleDto(Voo entity) {
        return modelMapper.map(entity, SimpleVooDto.class);
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

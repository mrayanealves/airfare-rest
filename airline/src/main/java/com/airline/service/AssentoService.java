package com.airline.service;

import com.airline.dto.AssentoDto;
import com.airline.model.Assento;
import com.airline.repository.AssentoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssentoService {
    @Autowired
    protected ModelMapper modelMapper;

    @Autowired
    private AssentoRepository repository;

    public List<AssentoDto> getAssentosDisponiveis(Long id){
        return repository.getAssentosDisponiveis( id ).stream().map( this::convertToDto ).collect( Collectors.toList() );
    }

    private AssentoDto convertToDto(Assento entity) {
        return modelMapper.map(entity, AssentoDto.class);
    }
}

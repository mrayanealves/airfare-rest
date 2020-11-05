package com.airline.service;

import com.airline.dto.AviaoDto;
import com.airline.model.Aviao;
import com.airline.repository.AviaoRepository;
import com.airline.repository.GeneticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AviaoService extends AbstractService<Aviao, AviaoDto>{
    @Autowired
    private AviaoRepository repository;

    @Override
    protected GeneticRepository<Aviao> repository() {
        return this.repository;
    }

    @Override
    protected AviaoDto convertToDto(Aviao entity) {
        return modelMapper.map(entity, AviaoDto.class);
    }

    @Override
    protected Aviao convertToEntity(AviaoDto dto) {
        return modelMapper.map(dto, Aviao.class);
    }
}

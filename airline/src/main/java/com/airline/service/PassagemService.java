package com.airline.service;

import com.airline.dto.PassagemDto;
import com.airline.model.Passagem;
import com.airline.repository.GeneticRepository;
import com.airline.repository.PassagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PassagemService extends AbstractService<Passagem, PassagemDto>{
    @Autowired
    private PassagemRepository repository;

    @Override
    protected GeneticRepository<Passagem> repository() {
        return this.repository;
    }

    public List<PassagemDto> getPassagensVoo(Long idVoo, int limit, int page){
        return repository.findByVoo( idVoo, limit, page ).stream()
                .map( this::convertToDto ).collect( Collectors.toList() );
    }

    @Override
    protected PassagemDto convertToDto(Passagem entity) {
        return modelMapper.map(entity, PassagemDto.class);
    }

    @Override
    protected Passagem convertToEntity(PassagemDto dto) {
        return modelMapper.map(dto, Passagem.class);
    }
}

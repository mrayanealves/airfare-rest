package com.airline.repository;

import com.airline.model.Assento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssentoRepository extends GeneticRepository<Assento>{
    @Query(value = "select a.* " +
            "from assento a join aviao av on a.id_aviao = av.id " +
            "left join passagem p on a.id = p.id_assento " +
            "join voo v on av.id = v.id_aviao " +
            "where p.id is null and v.id = :idVoo", nativeQuery = true)
    List<Assento> getAssentosDisponiveis(@Param( "idVoo" ) Long idVoo);
}

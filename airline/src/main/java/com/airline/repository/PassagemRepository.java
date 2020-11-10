package com.airline.repository;

import com.airline.model.Passagem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PassagemRepository extends GeneticRepository<Passagem>{
    @Query(value = "select * " +
            "from passagem " +
            "where id_voo = :idVoo " +
            "limit :limit offset(:page - 1) * :limit", nativeQuery = true)
    List<Passagem> findByVoo(@Param( value = "idVoo") Long idVoo,
                             @Param(value = "limit") int limit,
                             @Param(value = "page") int page);
}

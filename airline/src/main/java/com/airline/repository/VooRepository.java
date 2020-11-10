package com.airline.repository;

import com.airline.model.Voo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VooRepository extends GeneticRepository<Voo>{
    @Query(value = "select * " +
            "from voo v " +
            "where v.data like :data " +
            "and v.origem = :origem " +
            "and v.destino = :destino " +
            "limit :limit offset(:page - 1) * :limit", nativeQuery = true)
    List<Voo> findVoo(@Param(value = "data") String data,
                      @Param(value = "origem") String origem,
                      @Param(value = "destino") String destino,
                      @Param(value = "limit") int limit,
                      @Param(value = "page") int page);
}

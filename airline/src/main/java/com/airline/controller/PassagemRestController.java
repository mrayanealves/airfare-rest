package com.airline.controller;

import com.airline.dto.PassagemDto;
import com.airline.service.PassagemService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("passagem")
public class PassagemRestController {
    @Autowired
    private PassagemService service;

    @ApiOperation(value = "Retorna as passagens de um determiado voo.", 
            httpMethod = "GET")
    @GetMapping("/voo/{idVoo}")
    public List<PassagemDto> getByVoo(@PathVariable Long idVoo, @RequestParam("limit") int limit, @RequestParam("page") int page){
        return service.getPassagensVoo( idVoo, limit, page );
    }

    @ApiOperation(value = "Reserva um nova passagem.",
            httpMethod = "POST")
    @PostMapping("/reservar")
    public ResponseEntity<PassagemDto> save(@RequestBody PassagemDto passagemDto) {
        return ResponseEntity.ok(service.save(passagemDto));
    }

}

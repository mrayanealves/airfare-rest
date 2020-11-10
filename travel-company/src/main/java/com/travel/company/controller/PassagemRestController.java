package com.travel.company.controller;

import com.travel.company.dto.PassagemDto;
import com.travel.company.dto.Reserva;
import com.travel.company.service.PassagemService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("passagem")
public class PassagemRestController {
    @Autowired
    private PassagemService passagemService;

    @ApiOperation(value = "Reserva passagens para um voo de uma determinada empresa.",
            httpMethod = "POST")
    @PostMapping("/reservar")
    public ResponseEntity<PassagemDto> pesquisar(@RequestBody Reserva reserva){
        return passagemService.reservarPassagem( reserva );
    }
}

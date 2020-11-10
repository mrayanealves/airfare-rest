package com.travel.company.service;

import com.travel.company.dto.PassagemDto;
import com.travel.company.dto.Reserva;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PassagemService {
    public ResponseEntity<PassagemDto> reservarPassagem(Reserva reserva){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/" + reserva.getEmpresa().toLowerCase() + "/passagem/reservar";

        return restTemplate.postForEntity(url, reserva.getPassagemDto(), PassagemDto.class);
    }
}

package com.travel.company.service;

import com.travel.company.dto.VooDto;
import com.travel.company.dto.Voos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class VooService {
    /**
     * Pesquisa voos
     * @param data Data do voo
     * @param origem Lugar de origem
     * @param destino Lugar de destino
     * @return Lista de voos
     */
    public List<Voos> pesquisarVoo(String data, String origem, String destino){
        List<Voos> response = new ArrayList<>();

        pesquisarVooAirline( "Latam", data, origem, destino, response );
        pesquisarVooAirline( "Gol", data, origem, destino, response );
        pesquisarVooAirline( "Azul", data, origem, destino, response );

        return response;
    }

    /**
     * Pesquisa voos nas empresas
     * @param data Data do voo
     * @param origem Lugar de origem
     * @param destino Lugar de destino
     * @return Lista de voos
     */
    private void pesquisarVooAirline(String empresaName, String data, String origem,
                                     String destino, List<Voos> response){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/" + empresaName.toLowerCase() + "/voo/pesquisar?data=" + data +
                "&origem=" + origem +
                "&destino=" + destino +
                "&limit=" + 100 +
                "&page=" + 1;

        ResponseEntity<VooDto[]> responseEntity = restTemplate.getForEntity(url, VooDto[].class);

        if (responseEntity.getBody() == null || responseEntity.getBody().length == 0){
            return;
        }

        response.add( new Voos(empresaName, responseEntity.getBody()) );
    }
}

package com.airline.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class VooDto extends AbstractDto{
    @NotBlank(message = "Data não pode ser nula ou vazia.")
    private String data;

    @NotBlank(message = "Origem não pode ser nulo ou vazio.")
    private String origem;

    @NotBlank(message = "Origem não pode ser nulo ou vazio.")
    private String destino;

    @NotNull(message = "Avião não pode ser nulo ou vazio.")
    private AviaoDto aviao;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public AviaoDto getAviao() {
        return aviao;
    }

    public void setAviao(AviaoDto aviao) {
        this.aviao = aviao;
    }
}

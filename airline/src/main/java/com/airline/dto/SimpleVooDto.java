package com.airline.dto;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class SimpleVooDto extends AbstractDto {
    @NotBlank(message = "Data não pode ser nula ou vazia.")
    private String data;

    @NotBlank(message = "Origem não pode ser nulo ou vazio.")
    private String origem;

    @NotBlank(message = "Origem não pode ser nulo ou vazio.")
    private String destino;

    private SimpleAviaoDto aviao;

    private List<AssentoDto> assentosDisponiveis;

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

    public SimpleAviaoDto getAviao() {
        return aviao;
    }

    public void setAviao(SimpleAviaoDto aviao) {
        this.aviao = aviao;
    }

    public List<AssentoDto> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(List<AssentoDto> assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
}

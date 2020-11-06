package com.airline.dto;

import java.util.List;

public class VooPesquisaDto extends AbstractDto {
    private String data;

    private AviaoPesquisaDto aviao;

    private List<AssentoDto> assentosDisponiveis;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public AviaoPesquisaDto getAviao() {
        return aviao;
    }

    public void setAviao(AviaoPesquisaDto aviao) {
        this.aviao = aviao;
    }

    public List<AssentoDto> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(List<AssentoDto> assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
}

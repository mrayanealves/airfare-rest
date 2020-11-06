package com.airline.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class VooDto extends AbstractDto{
    @NotBlank(message = "Data não pode ser nulo ou vazio.")
    private String data;

    @NotNull
    private AviaoDto aviao;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public AviaoDto getAviao() {
        return aviao;
    }

    public void setAviao(AviaoDto aviao) {
        this.aviao = aviao;
    }
}

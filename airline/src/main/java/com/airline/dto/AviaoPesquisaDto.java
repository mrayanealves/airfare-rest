package com.airline.dto;

import javax.validation.constraints.NotBlank;

public class AviaoPesquisaDto extends AbstractDto {
    @NotBlank(message = "Código deve ser informado.")
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

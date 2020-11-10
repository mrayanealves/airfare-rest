package com.airline.dto;

import javax.validation.constraints.NotBlank;

public class AssentoDto extends AbstractDto {
    @NotBlank(message = "Código do assento não pode ser nulo ou vazio.")
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

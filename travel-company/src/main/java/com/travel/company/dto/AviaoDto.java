package com.travel.company.dto;

import javax.validation.constraints.NotBlank;

public class AviaoDto extends AbstractDto {
    @NotBlank(message = "Código deve ser informado.")
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

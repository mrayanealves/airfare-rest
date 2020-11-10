package com.airline.dto;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class AviaoDto extends AbstractDto {
    @NotBlank(message = "Código deve ser informado.")
    private String codigo;

    private List<AssentoDto> assentos;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<AssentoDto> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<AssentoDto> assentos) {
        this.assentos = assentos;
    }
}

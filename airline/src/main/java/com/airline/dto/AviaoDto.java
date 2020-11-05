package com.airline.dto;

import com.airline.model.Assento;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class AviaoDto extends AbstractDto {
    @NotBlank(message = "Código deve ser informado.")
    private String codigo;

    private List<Assento> assentos;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
}

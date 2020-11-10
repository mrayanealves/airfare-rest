package com.travel.company.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Reserva {
    @NotBlank(message = "A empresa deve ser informada.")
    private String empresa;

    @NotNull(message = "As informações para passagem devem ser informadas.")
    private PassagemDto passagemDto;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public PassagemDto getPassagemDto() {
        return passagemDto;
    }

    public void setPassagemDto(PassagemDto passagemDto) {
        this.passagemDto = passagemDto;
    }
}

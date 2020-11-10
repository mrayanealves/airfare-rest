package com.travel.company.dto;

import javax.validation.constraints.NotNull;

public class PassagemDto extends AbstractDto{
    @NotNull(message = "Voo deve ser informado.")
    private VooDto voo;

    @NotNull(message = "Assento deve ser informado.")
    private AssentoDto assento;

    @NotNull(message = "Usuário deve ser informado.")
    private UsuarioDto usuario;

    public VooDto getVoo() {
        return voo;
    }

    public void setVoo(VooDto voo) {
        this.voo = voo;
    }

    public AssentoDto getAssento() {
        return assento;
    }

    public void setAssento(AssentoDto assento) {
        this.assento = assento;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }
}

package com.airline.dto;

import com.airline.model.Usuario;

import javax.validation.constraints.NotNull;

public class PassagemDto extends AbstractDto{
    @NotNull(message = "Voo deve ser informado.")
    private SimpleVooDto voo;

    @NotNull(message = "Assento deve ser informado.")
    private AssentoDto assento;

    @NotNull(message = "Usuário deve ser informado.")
    private Usuario usuario;

    public SimpleVooDto getVoo() {
        return voo;
    }

    public void setVoo(SimpleVooDto voo) {
        this.voo = voo;
    }

    public AssentoDto getAssento() {
        return assento;
    }

    public void setAssento(AssentoDto assento) {
        this.assento = assento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

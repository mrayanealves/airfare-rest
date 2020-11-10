package com.airline.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "voo",
        uniqueConstraints={@UniqueConstraint(columnNames = {"data" , "id_aviao"})})
public class Voo extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VOO")
    @SequenceGenerator(name = "SEQ_VOO", sequenceName = "id_seq_voo", allocationSize = 1)
    private Long id;

    @NotBlank(message = "Data não pode ser nula ou vazia.")
    private String data;

    @NotBlank(message = "Origem não pode ser nulo ou vazio.")
    private String origem;

    @NotBlank(message = "Origem não pode ser nulo ou vazio.")
    private String destino;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_aviao")
    private Aviao aviao;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
}

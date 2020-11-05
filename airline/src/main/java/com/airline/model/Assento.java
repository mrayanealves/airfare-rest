package com.airline.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "assento")
public class Assento extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ASSENTO")
    @SequenceGenerator(name = "SEQ_ASSENTO", sequenceName = "id_seq_assento", allocationSize = 1)
    private Long id;

    @NotBlank(message = "Código não pode ser nulo ou vazio.")
    private String codigo;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
}

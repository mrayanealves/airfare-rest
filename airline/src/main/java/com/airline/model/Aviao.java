package com.airline.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "aviao")
public class Aviao extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AVIAO")
    @SequenceGenerator(name = "SEQ_AVIAO", sequenceName = "id_seq_aviao", allocationSize = 1)
    private Long id;

    @NotBlank(message = "Código não pode ser nulo ou vazio.")
    private String codigo;

    @OneToMany(mappedBy = "aviao", cascade = CascadeType.ALL)
    private List<Assento> assentos;

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

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        assentos.forEach( assento -> assento.setAviao( this ) );
        this.assentos = assentos;
    }
}

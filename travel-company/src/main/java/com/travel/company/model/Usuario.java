package com.travel.company.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "usuario")
public class Usuario extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
    @SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "id_seq_usuario", allocationSize = 1)
    private Long id;

    @NotBlank(message = "Nome não pode ser nulo nem vazio.")
    private String nome;

    @NotBlank(message = "CPF não pode ser nulo ou vazio.")
    private String cpf;

    @NotBlank(message = "Email não pode ser nulo nem vazio.")
    @Column(unique = true)
    private String email;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.lab.sistema_de_moedas.model;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder

@EqualsAndHashCode(callSuper = true)
public class Professor extends Usuario {
    
    private String cpf;
    private String departamento;

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
}
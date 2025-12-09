package com.lab.sistema_de_moedas.model;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder

@EqualsAndHashCode(callSuper = true)
public class Aluno extends Usuario {
    
    private String matricula;
    private String curso;
    private String cpf;
    private String rg;
    private String instituicaoEnsino;
    private String endereco;

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
    public String getInstituicaoEnsino() { return instituicaoEnsino; }
    public void setInstituicaoEnsino(String instituicaoEnsino) { this.instituicaoEnsino = instituicaoEnsino; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
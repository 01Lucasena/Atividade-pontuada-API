package com.senai.atividade_pontuada.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo 'nome' não pode estar vazio.")
    private String nome;

    @NotNull(message = "O campo 'cpf' não pode estar vazio.")
    private String cpf;

    @NotBlank(message = "O campo 'dataNascimento' não pode estar vazio.")
    private String dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @NotNull(message = "O campo 'salario' não pode estar vazio.")
    private Double salario;

    @NotBlank(message = "O campo 'email' não pode estar vazio.")
    @Email(message = "O campo 'email' deve ser um endereço de e-mail válido.")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O campo 'nome' não pode estar vazio.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O campo 'nome' não pode estar vazio.") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo 'cpf' não pode estar vazio.") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotNull(message = "O campo 'cpf' não pode estar vazio.") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "O campo 'dataNascimento' não pode estar vazio.") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "O campo 'dataNascimento' não pode estar vazio.") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public @NotNull(message = "O campo 'salario' não pode estar vazio.") Double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "O campo 'salario' não pode estar vazio.") Double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "O campo 'email' não pode estar vazio.") @Email(message = "O campo 'email' deve ser um endereço de e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O campo 'email' não pode estar vazio.") @Email(message = "O campo 'email' deve ser um endereço de e-mail válido.") String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario(Long id, String nome, String cpf, String dataNascimento, Sexo sexo, Setor setor, EstadoCivil estadoCivil, Double salario, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;


    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", estadoCivil=" + estadoCivil +
                ", salario=" + salario +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

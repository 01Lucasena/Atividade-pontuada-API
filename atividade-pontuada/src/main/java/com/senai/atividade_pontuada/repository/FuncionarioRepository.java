package com.senai.atividade_pontuada.repository;

import com.senai.atividade_pontuada.model.Funcionario;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long> {

    Optional<Funcionario> findByEmail(String email);
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Exemplo: List<Funcionario> findByNome(String nome);
}

package com.senai.atividade_pontuada.controller;

import com.senai.atividade_pontuada.model.Funcionario;
import com.senai.atividade_pontuada.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {


    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public List<Funcionario> listarTodos(){
        return funcionarioService.findAll();
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>> salvar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionario cadastrado com sucesso"));
    }

    @PutMapping
    public ResponseEntity<Map<String,Object>> atualizar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.atualizar(funcionario);

        return ResponseEntity.ok().body(Map.of("mensagem", "Funcionario atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> deletar(@PathVariable Long id){
        funcionarioService.deletar(id);

        return ResponseEntity.ok().body(Map.of("mensagem", "Funcionario deletado com sucesso"));
    }

}

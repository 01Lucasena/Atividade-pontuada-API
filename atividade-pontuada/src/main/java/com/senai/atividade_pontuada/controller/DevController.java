package com.senai.atividade_pontuada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class DevController {

    @GetMapping
    public String dev() {
        return "Dev: Lucas Barbosa";
    }
}

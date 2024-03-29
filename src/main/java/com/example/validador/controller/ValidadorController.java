package com.example.validador.controller;

import com.example.validador.model.Documento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValidadorController {
    @GetMapping("/products")
    public String getProducts() {
        return "Lista desde Proyecto B";
    }

    @PostMapping("/validar")
    public Boolean getValidation(@RequestBody List<Documento> documentos) {
        return true;
    }
    
}

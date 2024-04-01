package com.example.validador.controller;

import com.example.validador.model.Documento;
import com.example.validador.service.ValidadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class ValidadorController {

  private ValidadorService validadorService;
  private final WebClient.Builder webClientBuilder;
  private final WebClient webClient;


  @Autowired
  public ValidadorController(ValidadorService validadorService, WebClient.Builder webClientBuilder){
    this.validadorService = validadorService;
    this.webClientBuilder = webClientBuilder;
    this.webClient = webClientBuilder.baseUrl("http://localhost/8081").build();

  }

    @GetMapping("/products")
    public String getProducts() {
        return "Lista desde Proyecto B";
    }

    @PostMapping("/validar")
    public Boolean getValidation(@RequestBody List<Documento> documentos) {
        return true;
    }

  @PostMapping("/validarr")
  public Mono<Void> getValidationn(@RequestBody List<Documento> documentos) {
    List<Documento> registrosValidos = validadorService.validarRegistros(documentos);

    return webClientBuilder.build()
      .post()
      .uri("http://localhost:8081/registros-validados")
      .bodyValue(registrosValidos)
      .retrieve()
      .bodyToMono(Void.class);
  }

}

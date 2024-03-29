package com.example.validador.service;

import com.example.validador.model.Documento;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

@Service
public class ValidadorService {

    public List<Documento> validarRegistros(List<Documento> documentos) {
      List<Documento> registrosValidos = new ArrayList<>();

      for (Documento documento : documentos) {
        if (esFechaValida(documento.getDate())) {

          registrosValidos.add(documento);
        }
      }

      return registrosValidos;
    }

    // Método para validar la fecha
    private boolean esFechaValida(String fecha) {
      String fechaPattern = "^\\d{1,2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{2}$";
      return fecha.matches(fechaPattern);
    }

      //metodo validar
    private boolean esDecimalValido(double daysLost) {
        //validar
      return false;
    }

    // Método para validar el grupo de edad
    private boolean esGrupoEdadValido(String ageGroup) {
      // Implementa la lógica de validación del grupo de edad aquí
      // Retorna true si el grupo de edad es válido, false en caso contrario
        return false;
    }

    // Método para validar el formato de correo electrónico
    private boolean esCorreoValido(String email) {
      if (email == null || email.isEmpty()) {
        return false;
      }
      // Patrón para validar el correo electrónico
      String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
      return Pattern.matches(emailPattern, email);
    }


  }

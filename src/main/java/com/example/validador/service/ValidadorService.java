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
          if (esFechaValida(documento.getDate()) &&
                  esInjuryLocationValido(documento.getInjuryLocation()) &&
                  esReportTypeValido(documento.getReportType())) {

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

    // Método para validar el Injury Location
    private boolean esInjuryLocationValido(String injuryLocation) {
        return !injuryLocation.equals("N/A");
    }

    // Método para validar el Report Type
    private boolean esReportTypeValido(String reportType) {
        return reportType.equals("Near Miss") ||
                reportType.equals("Lost Time") ||
                reportType.equals("First Aid");
    }

  }

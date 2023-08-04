package br.com.ada.betbicho.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ApostaRequestDTO {

    private LocalDate data;
    private BigDecimal valor;
    private String local;
    private List<Integer> bichos;
    private Integer apostador;

}

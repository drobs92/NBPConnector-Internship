package com.example.nbpconnectorinternship.model;

import lombok.Data;

import java.util.List;

@Data
public class CurrencyDTO {

    private String table;
    private String currency;
    private String code;
    private List<CurrencyRatesDTO> rates;
}

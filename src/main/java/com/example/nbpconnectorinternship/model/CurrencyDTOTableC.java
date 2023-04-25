package com.example.nbpconnectorinternship.model;

import lombok.Data;

import java.util.List;

@Data
public class CurrencyDTOTableC {
    private String table;
    private String currency;
    private String code;
    private List<CurrencyRatesDTOTableC> rates;

}

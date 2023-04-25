package com.example.nbpconnectorinternship.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CurrencyRatesDTO {

    private String no;
    private LocalDate effectiveDate;
    private double mid;
}


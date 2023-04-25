package com.example.nbpconnectorinternship.model;


import lombok.Data;

import java.time.LocalDate;

@Data
public class CurrencyRatesDTOTableC {
    private String no;
    private LocalDate effectiveDate;
    private double mid;

}

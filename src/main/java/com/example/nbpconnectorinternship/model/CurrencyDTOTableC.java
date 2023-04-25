package com.example.nbpconnectorinternship.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Builder
@Getter
public class CurrencyDTOTableC {
    private String table;
    private String currency;
    private String code;
    private List<CurrencyRatesDTOTableC> rates;

}

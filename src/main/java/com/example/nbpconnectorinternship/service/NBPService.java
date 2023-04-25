package com.example.nbpconnectorinternship.service;

import com.example.nbpconnectorinternship.model.CurrencyDTO;
import com.example.nbpconnectorinternship.webclient.NBPClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class NBPService {

    private final NBPClient nbpClient;

    public CurrencyDTO returnAverageByGivingCodeAndDate(String code, LocalDate date) {
        return nbpClient.getAverageForSingleCurrencyOnGivenDay(code, date);
    }
}

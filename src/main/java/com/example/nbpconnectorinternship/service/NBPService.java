package com.example.nbpconnectorinternship.service;

import com.example.nbpconnectorinternship.model.CurrencyDTO;
import com.example.nbpconnectorinternship.model.CurrencyDTOTableC;
import com.example.nbpconnectorinternship.webclient.NBPClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
@AllArgsConstructor
public class NBPService {

    private final NBPClient nbpClient;

    public CurrencyDTO returnAverageByGivingCodeAndDate(String code, LocalDate date) {
        return nbpClient.getAverageForSingleCurrencyOnGivenDay(code, date);
    }

    public CurrencyDTOTableC getMaximumAndMinimumForSingleCurrencyAndGivenAmountOfQuotations(String codeC,double quotationNumber){
        return nbpClient.getMaximumAndMinimumForSingleCurrencyAndGivenAmountOfQuotations(codeC, quotationNumber);
    }


}

package com.example.nbpconnectorinternship.webclient;

import com.example.nbpconnectorinternship.model.CurrencyDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

import static com.example.nbpconnectorinternship.utils.UriUtils.TABLE_A_URL;


@Component
public class NBPClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public CurrencyDTO getAverageForSingleCurrencyOnGivenDay(String code, LocalDate date) {
        return restTemplate.getForObject( TABLE_A_URL + "{code}" + "/" + "{date}", CurrencyDTO.class, code, date);
    }
}

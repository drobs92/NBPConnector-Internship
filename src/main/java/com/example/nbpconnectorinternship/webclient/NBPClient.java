package com.example.nbpconnectorinternship.webclient;

import com.example.nbpconnectorinternship.model.CurrencyDTO;
import com.example.nbpconnectorinternship.model.CurrencyDTOTableC;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Arrays;

import static com.example.nbpconnectorinternship.utils.UriUtils.TABLE_A_URL;
import static com.example.nbpconnectorinternship.utils.UriUtils.TABLE_C_URL;


@Component
public class NBPClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public CurrencyDTO getAverageForSingleCurrencyOnGivenDay(String code, LocalDate date) {
        return restTemplate.getForObject( TABLE_A_URL + "{code}" + "/" + "{date}", CurrencyDTO.class, code, date);
    }
    public CurrencyDTOTableC getMaximumAndMinimumForSingleCurrencyAndGivenAmountOfQuotations(String codeC,double quotationNumber){
        return restTemplate.getForObject(TABLE_C_URL + "{codeC}" + "/last" + "{quotationNumber}" + "?format=json" , CurrencyDTOTableC.class, codeC,quotationNumber);
    }
    /*public CurrencyDTOTableC getMaximumAndMinimumForSingleCurrencyAndGivenAmountOfQuotations(String codeC, double quotationNumber){
        CurrencyDTOTableC currencyDTOTableC=callGetMethodTableC(CurrencyDTOTableC.class, codeC,quotationNumber);
        return CurrencyDTOTableC.builder()
                .currency(currencyDTOTableC.getCurrency())
                .rates(currencyDTOTableC.getRates().stream().max().)
                .rates(currencyDTOTableC.getRates().stream().min().get())
                .build();
    }*/
    /*private <T> T callGetMethodTableC(Class<T> responseType,Object... objects){
        return restTemplate.getForObject(TABLE_C_URL + "{codeC}" + "/last" + "{quotationNumber}" + "?format=json" , responseType, objects);
    }*/
}

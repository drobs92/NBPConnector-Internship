package com.example.nbpconnectorinternship.controller;

import com.example.nbpconnectorinternship.model.CurrencyDTO;
import com.example.nbpconnectorinternship.service.NBPService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.HttpClientErrorException;

import java.time.LocalDate;

@Controller
@RequiredArgsConstructor
public class NBPController {

    private final NBPService nbpService;

    @GetMapping("/average")
    public String getQueryPageForFirstTask() {
        return "average";
    }

    @GetMapping("/average/")
    public String getAverageCurrencyByDate(Model model, String code, LocalDate date) {
        CurrencyDTO currencyDTO = nbpService.returnAverageByGivingCodeAndDate(code, date);
        model.addAttribute("currency", currencyDTO);
        return "result_pages/first-task";
    }

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public String handleClientError(HttpClientErrorException.NotFound e, Model model) {
        model.addAttribute("code", e.getStatusCode());
        model.addAttribute("message", e.getStatusText());
        return "exceptions/error";
    }
}
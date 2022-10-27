package com.demo.microserviceservice.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.microserviceservice.dtos.ExchangeValueDTO;
import com.demo.microserviceservice.exception.GeneralException;
import com.demo.microserviceservice.services.IExchangeValueService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/api/exchange")
public class DemoController {

    @Autowired
    private IExchangeValueService exchangeValueService;
    
    @GetMapping("/currency/from/{from}/to/{to}")
    @Operation(summary = "Obtiene el valor de ExchangeValue.")
    public ExchangeValueDTO retrieveExchangeValue(HttpServletResponse response, @Parameter(description="Desde que se va a convertir", example = "EUR") @PathVariable String from,
    			@Parameter(description="A que se va a convertir", example = "INR") @PathVariable String to) throws IOException {

        try {
			return exchangeValueService.getExchangeValue(from, to);
		} catch (GeneralException e) {
			(response).sendError(e.getCodeError(), e.getMessage());
			return null;
		} catch (Exception e) {
            e.printStackTrace();
            (response).sendError(500, e.getMessage());
            return null;
        }
        
    }
}

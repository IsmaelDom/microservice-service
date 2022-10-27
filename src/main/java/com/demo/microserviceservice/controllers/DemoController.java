package com.demo.microserviceservice.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.microserviceservice.dtos.ExchangeValueDTO;
import com.demo.microserviceservice.exception.GeneralException;
import com.demo.microserviceservice.services.IExchangeValueService;

@RestController
public class DemoController {

    @Autowired
    private IExchangeValueService exchangeValueService;
    
    @GetMapping("/currency/from/{from}/to/{to}")
    public ExchangeValueDTO retrieveExchangeValue(HttpServletResponse response, @PathVariable String from, @PathVariable String to) throws IOException {

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

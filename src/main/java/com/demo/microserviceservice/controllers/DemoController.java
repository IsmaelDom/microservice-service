package com.demo.microserviceservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import com.demo.microserviceservice.models.ExchangeValue;
import com.demo.microserviceservice.repository.ExchangeValueRepository;

@RestController
public class DemoController {

	@Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;
    
    @GetMapping("/currency/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);

        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }
}

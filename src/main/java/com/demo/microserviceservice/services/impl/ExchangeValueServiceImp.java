package com.demo.microserviceservice.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.demo.microserviceservice.exception.GeneralException;
import com.demo.microserviceservice.dtos.ExchangeValueDTO;
import com.demo.microserviceservice.models.ExchangeValue;
import com.demo.microserviceservice.repository.ExchangeValueRepository;
import com.demo.microserviceservice.services.IExchangeValueService;

@Service
public class ExchangeValueServiceImp implements IExchangeValueService{
	
	@Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    ModelMapper modelMapper = new ModelMapper();
    
	@Override
	public ExchangeValueDTO getExchangeValue(String from, String to) throws GeneralException {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
        
        ExchangeValueDTO dto = null;
        
        if (exchangeValue != null) {
        	exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            
            dto = modelMapper.map(exchangeValue, ExchangeValueDTO.class);
		} else {
			throw new GeneralException("No se encontraron datos con los parametros ingresados", 404);
		}
        
        return dto;
	}

}

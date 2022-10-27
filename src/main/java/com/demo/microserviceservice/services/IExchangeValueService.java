package com.demo.microserviceservice.services;

import com.demo.microserviceservice.dtos.ExchangeValueDTO;
import com.demo.microserviceservice.exception.GeneralException;

public interface IExchangeValueService {

	public ExchangeValueDTO getExchangeValue(String from, String to) throws GeneralException;
	
}

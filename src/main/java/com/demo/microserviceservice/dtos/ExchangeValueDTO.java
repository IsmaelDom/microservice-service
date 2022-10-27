package com.demo.microserviceservice.dtos;

import java.math.BigDecimal;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValueDTO {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
}

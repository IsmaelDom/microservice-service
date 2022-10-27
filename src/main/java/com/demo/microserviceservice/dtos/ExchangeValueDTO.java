package com.demo.microserviceservice.dtos;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValueDTO {

	@Schema(description = "Identificador.", example = "1", required = true)
	private Long id;
	
	@Schema(description = "Que se va a convertir.", example = "USD", required = true)
	private String from;
	
	@Schema(description = "A que se va a convertir.", example = "INR", required = true)
	private String to;
	
	@Schema(description = "Valor a convertir.", example = "1", required = true)
	private BigDecimal conversionMultiple;
	
	@Schema(description = "Puerto.", example = "1", required = false)
	private int port;
	
}

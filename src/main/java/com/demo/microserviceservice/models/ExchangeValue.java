package com.demo.microserviceservice.models;

import java.math.BigDecimal;
import javax.persistence.*;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeValue {
	
	 @Id
	 @Schema(description = "Identificador.", example = "1", required = true)
	 private Long id;

	 @Column(name = "currency_from")
	 @Schema(description = "Que se va a convertir.", example = "USD", required = true)
	 private String from;

	 @Column(name = "currency_to")
	 @Schema(description = "A que se va a convertir.", example = "INR", required = true)
	 private String to;

	 @Schema(description = "Valor a convertir.", example = "1", required = true)
	 private BigDecimal conversionMultiple;
	 
	 @Schema(description = "Puerto.", example = "1", required = false)
	 private int port;
}

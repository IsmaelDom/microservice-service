package com.demo.microserviceservice.models;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeValue {
	
	 @Id
	 private Long id;

	 @Column(name = "currency_from")
	 private String from;

	 @Column(name = "currency_to")
	 private String to;

	 private BigDecimal conversionMultiple;
	 
	 private int port;
}

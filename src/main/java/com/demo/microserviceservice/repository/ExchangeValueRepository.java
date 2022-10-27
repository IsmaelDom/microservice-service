package com.demo.microserviceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.microserviceservice.models.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	 ExchangeValue findByFromAndTo(String from, String to);
}

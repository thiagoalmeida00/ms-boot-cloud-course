package com.msbootcloud.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	/* Padrão de Projeto Singleton para ter disponível um objeto
	 * RestTemplate para injetar em outros serviços */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}

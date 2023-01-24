package com.msbootcloud.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.msbootcloud.hrpayroll.entities.Payment;

/* Registrar o serviço como um componente do Spring para que seja
 * injetado em outras classes */
@Service
public class PaymentService {

	public Payment getPayments(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
	
}

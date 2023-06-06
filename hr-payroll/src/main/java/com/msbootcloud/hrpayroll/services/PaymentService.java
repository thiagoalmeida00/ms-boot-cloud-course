package com.msbootcloud.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msbootcloud.hrpayroll.entities.Payment;
import com.msbootcloud.hrpayroll.entities.Worker;
import com.msbootcloud.hrpayroll.feignclients.WorkerFeignClient;

/* Registrar o serviço como um componente do Spring para que seja
 * injetado em outras classes */
@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayments(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}

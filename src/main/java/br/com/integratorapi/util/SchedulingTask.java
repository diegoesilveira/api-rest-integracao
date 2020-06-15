package br.com.integratorapi.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.integratorapi.integration.ItinerarioIntegration;

@Component
@EnableScheduling
public class SchedulingTask {

	
//
	@Autowired
	private ItinerarioIntegration it;

	private final long SECOND = 10000;
	private final long MINUTE = SECOND * 30;
//
//	@Scheduled(fixedDelay = MINUTE)
//	public void scheduleFutureTaskLinha() {
//		System.out.println("Passou no agendador!!");
//		linha.getApiOfLinhas();
//		
//	}

	@Scheduled(fixedDelay = MINUTE)
	public void scheduleFutureTaskItinerario() {
		it.getApiOfItinerario();
		System.out.println("Passou no agendador");
		
	}

}

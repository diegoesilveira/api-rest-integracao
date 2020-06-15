//package br.com.integratorapi.integration;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import br.com.integratorapi.domain.Itinerario;
//import br.com.integratorapi.domain.LinhaOnibus;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@Component
//public class TesteIntegracao {
//
//	@Autowired
//	private WebClient webClient;
//
//	public void getLinhaAPI3() {
//		System.out.println("----------------Entrando webclient-----------");
//
//		Flux<LinhaOnibus> monoItinerario = this.webClient.method(HttpMethod.GET)
//				 .uri("?a=nc&p=%25&t=o").retrieve()
//				.bodyToFlux(LinhaOnibus.class);
//		
//		LinhaOnibus linha = monoItinerario.blockFirst();
//		System.out.println("linha");
//		
//	
//	}
//	
//	
//	@Bean
//	public void getLinhaAPI2() {
//		Flux<LinhaOnibus> response = WebClient.create("http://www.poatransporte.com.br/php/facades/process.php")
//				.get()
//				.uri("?a=nc&p=%25&t=o")
//				.accept(MediaType.APPLICATION_JSON)
//				.retrieve()
//				.bodyToFlux(LinhaOnibus.class);
//				//LinhaOnibus linha = response.blockFirst();
//				System.out.println(response.blockFirst());
//				System.out.println("----------------FIM -----------");
//	}
//
//	
//	
//	
//	 
//	 
//	
//}

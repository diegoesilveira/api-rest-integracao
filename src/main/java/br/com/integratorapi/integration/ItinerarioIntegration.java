package br.com.integratorapi.integration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.integratorapi.domain.Itinerario;
import br.com.integratorapi.domain.LinhaOnibus;

@Component
public class ItinerarioIntegration {

	@Autowired
	private RestTemplate restTemplate;



	@Bean
	public void getApiOfItinerario() {
		
		System.out.println("Passou na getApiOfItinerario");
		
		String url = "www.poatransporte.com.br/php/facades/process.php?a=nc&p=%25&t=o";
		UriComponents uri =  UriComponentsBuilder.newInstance()
			.scheme("http")
			.host(url)
			.build();
		
		ResponseEntity<LinhaOnibus> obj = restTemplate.getForEntity(uri.toUriString(), LinhaOnibus.class);
		System.out.println(obj.getBody().getNome());
		
//		System.out.println(obj.getBody());
	//	List<Itinerario> lista = Arrays.asList(obj.getBody());

	}
	

	public List<Itinerario> findAllClient() {
		String url = "http://www.poatransporte.com.br/php/facades/process.php?a=nc&p=%&t=o";

		Itinerario[] obj = restTemplate.getForObject(url, Itinerario[].class);
		List<Itinerario> lista = Arrays.asList(obj);
		//repository.saveAll(lista);
		return lista;
	}

}

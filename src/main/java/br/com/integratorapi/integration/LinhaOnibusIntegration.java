package br.com.integratorapi.integration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.integratorapi.domain.LinhaOnibus;
import br.com.integratorapi.service.LinhaOnibusService;

@Component
public class LinhaOnibusIntegration {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private LinhaOnibusService linhaOnibusService;

	
	public List<LinhaOnibus> getApiOfLinhas() {
		String url = "http://www.poatransporte.com.br/php/facades/process.php?a=nc&p=%25&t=o";

		LinhaOnibus[] obj = restTemplate.getForObject(url, LinhaOnibus[].class);
		List<LinhaOnibus> lista = Arrays.asList(obj);
		linhaOnibusService.saveAll(lista);
		return lista;
	}

}

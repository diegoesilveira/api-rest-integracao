package br.com.integratorapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class WebClientConf {

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder.baseUrl("http://www.poatransporte.com.br/php/facades/process.php")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}
	
	
}

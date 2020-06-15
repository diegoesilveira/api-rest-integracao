package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import br.com.integratorapi.util.SchedulingTask;


@EnableScheduling
@SpringBootApplication
public class ApiRestDatapoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestDatapoaApplication.class, args);

		SchedulingTask scheduling = new SchedulingTask();
		scheduling.scheduleFutureTaskItinerario();
		//scheduling.scheduleFutureTaskLinha();
	}

	

}

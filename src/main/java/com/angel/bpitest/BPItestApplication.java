package com.angel.bpitest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BPItestApplication {

	private static final Logger log = LoggerFactory.getLogger(BPItestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BPItestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Test test = restTemplate.getForObject(
					"https://api.coindesk.com/v1/bpi/currentprice.json", Test.class);
			log.info(test.toString());
		};
	}

}

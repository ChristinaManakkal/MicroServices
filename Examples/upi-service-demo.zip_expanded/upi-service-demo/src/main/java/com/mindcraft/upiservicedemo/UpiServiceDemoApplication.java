package com.mindcraft.upiservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UpiServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpiServiceDemoApplication.class, args);
	}
	
	/*Register the load-balanced restTemplate in the spring-container*/
	@Bean
	@LoadBalanced
	public RestTemplate createTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}

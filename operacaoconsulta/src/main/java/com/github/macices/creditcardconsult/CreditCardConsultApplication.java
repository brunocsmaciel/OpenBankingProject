package com.github.macices.creditcardconsult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CreditCardConsultApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardConsultApplication.class, args);
	}

}

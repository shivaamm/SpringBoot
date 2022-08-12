package com.handson.pnbbank;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient

@SpringBootApplication
public class PnbBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PnbBankApplication.class, args);
	}

}

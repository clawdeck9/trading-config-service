package com.cluster9.cloudtradingconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class CloudTradingConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTradingConfigServiceApplication.class, args);
	}
}

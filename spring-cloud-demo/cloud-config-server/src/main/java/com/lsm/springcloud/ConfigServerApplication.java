package com.lsm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * http://localhost:8888/{application}/{profile}[/{label}]
 * http://localhost:8888/{application}-{profile}.yml
 * http://localhost:8888/{label}/{application}-{profile}.yml
 * http://localhost:8888/{application}-{profile}.properties
 * http://localhost:8888/{label}/{application}-{profile}.properties
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}

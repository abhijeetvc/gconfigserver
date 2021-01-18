package com.configserver.gconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GconfigserverApplication.class, args);
	}

}

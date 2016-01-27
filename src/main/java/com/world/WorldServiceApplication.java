package com.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldServiceApplication.class, args);
	}
}

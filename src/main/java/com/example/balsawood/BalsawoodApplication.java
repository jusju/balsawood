package com.example.balsawood;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.balsawood.model.Balsawood;
import com.example.balsawood.model.BalsawoodRepository;

@SpringBootApplication
public class BalsawoodApplication {
	private static final Logger log = LoggerFactory.getLogger(BalsawoodApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BalsawoodApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner balsaDemo(BalsawoodRepository repository) {
		return (args) -> {
			log.info("save a couple of balsawood pieces");
			repository.save(new Balsawood(0, 0, 0, 0, 0, "C"));
			
			log.info("fetch all balsawood pieces");
			for (Balsawood balsawood: repository.findAll()) {
				log.info(balsawood.toString());
			}

		};
	}

}

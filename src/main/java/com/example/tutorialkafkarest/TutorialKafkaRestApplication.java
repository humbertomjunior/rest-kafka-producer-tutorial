package com.example.tutorialkafkarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialKafkaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialKafkaRestApplication.class, args);
	}

}

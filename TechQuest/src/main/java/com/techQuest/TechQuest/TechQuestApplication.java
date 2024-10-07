package com.techQuest.TechQuest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class TechQuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechQuestApplication.class, args);
	}

}

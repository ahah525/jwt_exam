package com.ll.exam.app__2022_10_04;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@EnableCaching
@SpringBootApplication
public class App20221004Application {

	public static void main(String[] args) {
		SpringApplication.run(App20221004Application.class, args);
	}

	// objectMapper 빈 등록
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}

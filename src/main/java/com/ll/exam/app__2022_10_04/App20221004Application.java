package com.ll.exam.app__2022_10_04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class App20221004Application {

	public static void main(String[] args) {
		SpringApplication.run(App20221004Application.class, args);
	}

}

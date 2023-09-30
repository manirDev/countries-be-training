package com.manirdev.countriesbe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Slf4j
public class CountriesBeApplication {

	public static void main(String[] args) {
		//log.error("Error is created");
		SpringApplication.run(CountriesBeApplication.class, args);
	}

}

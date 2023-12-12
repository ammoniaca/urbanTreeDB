package org.cnr.urbantreedb;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class UrbanTreeDBApplication {

	public static void main(String[] args) {

		SpringApplication.run(UrbanTreeDBApplication.class, args);
	}

}

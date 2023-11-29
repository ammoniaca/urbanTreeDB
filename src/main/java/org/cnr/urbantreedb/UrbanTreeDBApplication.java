package org.cnr.urbantreedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class UrbanTreeDBApplication {

	public static void main(String[] args) {


		Date now = new Date();

		System.out.println(now);
		TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
		System.out.println(now);


		SpringApplication.run(UrbanTreeDBApplication.class, args);
	}

}

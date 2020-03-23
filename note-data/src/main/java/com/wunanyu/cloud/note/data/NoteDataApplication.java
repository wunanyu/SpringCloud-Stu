package com.wunanyu.cloud.note.data;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NoteDataApplication {

	public static void main(String[] args) {
//		SpringApplication.run(NoteDataApplication.class, args);
		new SpringApplicationBuilder(NoteDataApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

}

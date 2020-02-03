package com.atos.studybuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// TODO move this swagger to config package
@EnableSwagger2
@SpringBootApplication
public class StudybuilderApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudybuilderApplication.class, args);
	}

}

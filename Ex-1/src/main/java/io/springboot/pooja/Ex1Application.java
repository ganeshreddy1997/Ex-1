package io.springboot.pooja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ex1Application extends SpringBootServletInitializer{
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	// TODO Auto-generated method stub
	return builder.sources(Ex1Application.class);
}
	
	public static void main(String[] args) {
		SpringApplication.run(Ex1Application.class, args);
		
	}
	
	@GetMapping("/hello")
	ResponseEntity<String> heyJenkins() {
		return new ResponseEntity<String> ("Welocome to Jenkins!",HttpStatus.OK);
		
	}

}

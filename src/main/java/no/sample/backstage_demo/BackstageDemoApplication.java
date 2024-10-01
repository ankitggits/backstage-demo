package no.sample.backstage_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BackstageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackstageDemoApplication.class, args);
	}

	@GetMapping("greet")
	public String hello() {
		return "Hello World";
	}

}

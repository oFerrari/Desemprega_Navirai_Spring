package br.edu.ifms.matricula;
import java.time.ZonedDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MatriculaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatriculaApplication.class, args);

	}
	@GetMapping("/olamundo")
	public ResponseEntity<String> olamundo(){
		return ResponseEntity.ok("ola mundo");
		
	}
	
	@GetMapping("/datatime")
	public ResponseEntity<String> dataTime(){
		var localDate = ZonedDateTime. now();
		return ResponseEntity.ok("data e hora: " + localDate);
	}
	
}

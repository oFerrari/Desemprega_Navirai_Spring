package br.edu.ifms.matricula.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.matricula.controller.dto.EstudanteRequest;
import br.edu.ifms.matricula.controller.dto.EstudanteResponse;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {
	@GetMapping()
	public ResponseEntity<String> olaMundo() {
		return ResponseEntity.ok("Ola Mundo");
	}

//	https://reqbin.com/

	@PostMapping
	public ResponseEntity<EstudanteResponse> create(@RequestBody EstudanteRequest estudanteRequest) {
		EstudanteResponse estudante = new EstudanteResponse();
		estudante.setNome("Andreii");
		estudante.setCpf("232.238.174-38");
		estudante.setEmail("andrei@gmail.com");

		estudante.setNome(estudanteRequest.getNome());
		estudante.setCpf(estudanteRequest.getCpf());
		estudante.setEmail(estudanteRequest.getEmail());

		estudante.setId(UUID.randomUUID());

		return ResponseEntity.ok(estudante);
	}
}

package br.edu.ifms.DesempregaNaviraiSpring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.DesempregaNaviraiSpring.controller.dto.VagaRequest;
import br.edu.ifms.DesempregaNaviraiSpring.controller.dto.VagaResponse;
import br.edu.ifms.DesempregaNaviraiSpring.controller.mapper.VagaMapper;
import br.edu.ifms.DesempregaNaviraiSpring.model.dto.VagaDto;
import br.edu.ifms.DesempregaNaviraiSpring.model.services.VagaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;


@RestController
@Tag(name = "Vaga", description = "Gerenciamento de vagas")
public class Vaga {
private final VagaService vagaService;
	
	public VagaController(VagaService vagaService) {
		this.vagaService = vagaService;
	}
	
	@GetMapping
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("Ola mundo");
	}
	
	@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um recurso")
	@ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Operação de sucesso",
          content = @Content(mediaType = "application/json",
          schema = @Schema(implementation = VagaResponse.class))),
      @ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
	})
	@PostMapping
	public ResponseEntity<VagaResponse> create(
			@RequestBody @Valid VagaRequest vagaRequest ) {
		
		VagaDto vagaDto = VagaMapper.requestToDto(vagaRequest);
		VagaDto vagaDto2 = vagaService.create(vagaDto);
		
		VagaResponse vagaResponse = VagaMapper.dtoToResponse(vagaDto2);
		return ResponseEntity.ok(vagaResponse);
	}

}

package br.edu.ifms.DesempregaNaviraiSpring.controller.mapper;

import br.edu.ifms.DesempregaNaviraiSpring.controller.dto.VagaRequest;
import br.edu.ifms.DesempregaNaviraiSpring.controller.dto.VagaResponse;
import br.edu.ifms.DesempregaNaviraiSpring.model.dto.VagaDto;

public class VagaMapper {
	public static VagaDto requestToDto( VagaRequest vagaRequest ) {
		VagaDto vagaDto = new VagaDto();
		vagaDto.setNome( vagaRequest.getNome() );
		vagaDto.setCpf( vagaRequest.getCpf() );
		vagaDto.setEmail( vagaRequest.getEmail() );
		vagaDto.setSenha( vagaRequest.getSenha() );
		return vagaDto;
	}
	
	public static VagaResponse dtoToResponse( VagaDto vagaDto ) {
		VagaResponse vagaResponse = new VagaResponse();
		vagaResponse.setId( vagaDto.getId() );
		vagaResponse.setNome( vagaDto.getNome() );
		vagaResponse.setCpf( vagaDto.getCpf() );
		vagaResponse.setEmail( vagaDto.getEmail() );
		return vagaResponse;
	}
}

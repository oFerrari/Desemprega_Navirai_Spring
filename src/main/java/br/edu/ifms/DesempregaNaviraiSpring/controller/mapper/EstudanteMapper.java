package br.edu.ifms.DesempregaNaviraiSpring.controller.mapper;

import br.edu.ifms.DesempregaNaviraiSpring.controller.dto.EstudanteRequest;
import br.edu.ifms.DesempregaNaviraiSpring.controller.dto.EstudanteResponse;
import br.edu.ifms.DesempregaNaviraiSpring.model.dto.EstudanteDto;

public class EstudanteMapper {
	
	public static EstudanteDto requestToDto( EstudanteRequest estudanteRequest ) {
		EstudanteDto estudanteDto = new EstudanteDto();
		estudanteDto.setNome( estudanteRequest.getNome() );
		estudanteDto.setCpf( estudanteRequest.getCpf() );
		estudanteDto.setEmail( estudanteRequest.getEmail() );
		estudanteDto.setSenha( estudanteRequest.getSenha() );
		return estudanteDto;
	}
	
	public static EstudanteResponse dtoToResponse( EstudanteDto estudanteDto ) {
		EstudanteResponse estudanteResponse = new EstudanteResponse();
		estudanteResponse.setId( estudanteDto.getId() );
		estudanteResponse.setNome( estudanteDto.getNome() );
		estudanteResponse.setCpf( estudanteDto.getCpf() );
		estudanteResponse.setEmail( estudanteDto.getEmail() );
		return estudanteResponse;
	}

}

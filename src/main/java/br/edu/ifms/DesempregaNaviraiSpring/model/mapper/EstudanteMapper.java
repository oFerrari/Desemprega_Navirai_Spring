package br.edu.ifms.DesempregaNaviraiSpring.model.mapper;

import br.edu.ifms.DesempregaNaviraiSpring.model.dto.EstudanteDto;
import br.edu.ifms.DesempregaNaviraiSpring.model.entities.Estudante;

public class EstudanteMapper {

	public static Estudante dtoToEntity( EstudanteDto estudanteDto ) {
		Estudante estudante = new Estudante();
		estudante.setNome( estudanteDto.getNome() );
		estudante.setCpf( estudanteDto.getCpf() );
		estudante.setEmail( estudanteDto.getEmail() );
		estudante.setSenha( estudanteDto.getSenha() );
		return estudante;
	}
	
	public static EstudanteDto entityToDto(Estudante estudante) {
		EstudanteDto estudanteDto = new EstudanteDto();
		estudanteDto.setId( estudante.getId() );
		estudanteDto.setNome( estudante.getNome() );
		estudanteDto.setCpf( estudante.getCpf() );
		estudanteDto.setEmail( estudante.getEmail() );
		return estudanteDto;
	}
	
}

package br.edu.ifms.DesempregaNaviraiSpring.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.DesempregaNaviraiSpring.model.dto.EstudanteDto;
import br.edu.ifms.DesempregaNaviraiSpring.model.entities.Estudante;
import br.edu.ifms.DesempregaNaviraiSpring.model.mapper.EstudanteMapper;
import br.edu.ifms.DesempregaNaviraiSpring.model.repositories.EstudanteRepository;
import br.edu.ifms.DesempregaNaviraiSpring.utils.MD5;

@Service
public class EstudanteService {
	
	private final EstudanteRepository repository;
	
	public EstudanteService(EstudanteRepository repository) {
		this.repository = repository;
	}

	public EstudanteDto create(EstudanteDto estudanteDto) {
		
		estudanteDto.setNome( estudanteDto.getNome().toUpperCase() );
		estudanteDto.setEmail( estudanteDto.getEmail().toLowerCase() );
		estudanteDto.setSenha( MD5.encode(estudanteDto.getSenha()) );
		
		if(repository.existsByCpf(estudanteDto.getCpf())) {
			throw new RuntimeException("CPF ja existe para  outro estudante");
		}
		if(repository.existsByEmail(estudanteDto.getEmail())) {
			throw new RuntimeException("Email ja existe para  outro  estudante");
		}
//		if(repository.existsByCpfOrEmail(estudanteDto.getEmail(), estudanteDto.getEmail())) {
//			throw new RuntimeException("CPF ou Email ja existe para outro estudante");
//		}
		
		
		
		
		Estudante estudante = EstudanteMapper.dtoToEntity(estudanteDto);
		repository.save(estudante);
		return EstudanteMapper.entityToDto(estudante);
	}

}






package com.mario.umlProject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mario.umlProject.domain.Cliente;
import com.mario.umlProject.repositores.ClienteRepository;
import com.mario.umlProject.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;

	
	public Optional<Cliente> buscar(Integer id) {
		Optional<Cliente> obj =repo.findById(id);
		return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado! Id:"+ Cliente.class.getName())));
		
	}

	

}

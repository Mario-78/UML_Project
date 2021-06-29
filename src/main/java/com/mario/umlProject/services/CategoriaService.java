package com.mario.umlProject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mario.umlProject.domain.Categoria;
import com.mario.umlProject.repositores.CategoriaRepository;
import com.mario.umlProject.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj =repo.findById(id);
		return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado! Id:"+ Categoria.class.getName())));
		
	}

	

}

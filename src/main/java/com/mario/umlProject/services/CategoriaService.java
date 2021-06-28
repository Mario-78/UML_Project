package com.mario.umlProject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mario.umlProject.domain.Categoria;
import com.mario.umlProject.repositores.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj =repo.findById(id);
		return obj;
		
	}

	

}
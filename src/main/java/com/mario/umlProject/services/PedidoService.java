package com.mario.umlProject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mario.umlProject.domain.Pedido;
import com.mario.umlProject.repositores.PedidoRepository;
import com.mario.umlProject.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;

	
	public Optional<Pedido> buscar(Integer id) {
		Optional<Pedido> obj =repo.findById(id);
		return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado! Id:"+ Pedido.class.getName())));
		
	}

	

}

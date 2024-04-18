package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;



public class ClienteService {

	private ClienteRepository clienteRepository;

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public Cliente getClienteById(long funcodigo) {
		return clienteRepository.findById(funcodigo).orElse(null);
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}

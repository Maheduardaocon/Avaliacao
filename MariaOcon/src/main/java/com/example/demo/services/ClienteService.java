package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;




public class ClienteService {

	private ClienteRepository clienteRepository;

	   public ClienteService (ClienteRepository clienteRepository) {
	        this.clienteRepository = clienteRepository;
	    }

	    
	    public Cliente findClienteById(Long id) {
	        Optional<Cliente> Cliente = clienteRepository.findById(id);
	        return Cliente.orElse(null);
	    }

	   
	    public List<Cliente> findAllCliente() {
	        return clienteRepository.findAll();
	    }

	    
	    public Cliente insertCliente(Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

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

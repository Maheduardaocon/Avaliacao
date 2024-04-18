package com.example.demo.services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.example.demo.entities.Fornecedor;
import com.example.demo.repositories.FornecedorRepository;


@Service
public class FornecedorService {

	private FornecedorRepository fornecedorRepository;

	public List<Fornecedor> getAllFornecedor() {
		return fornecedorRepository.findAll();
	}

	public Fornecedor getFornecedorById(long funcodigo) {
		return fornecedorRepository.findById(funcodigo).orElse(null);
	}

	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

}

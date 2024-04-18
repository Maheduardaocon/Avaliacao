package com.example.demo.services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.example.demo.entities.Produto;
import com.example.demo.repositories.ProdutoRepository;


@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

	public Produto getProdutoById(long funcodigo) {
		return produtoRepository.findById(funcodigo).orElse(null);
	}

	public List<Produto> getAllProduto() {
		return produtoRepository.findAll();
	}
		
	}

    


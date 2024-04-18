package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produto;
import com.example.demo.services.ProdutoService;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {

	private final ProdutoService produtoService;

	
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findProdutobyId(@PathVariable Long id) {
		Produto produto = produtoService.getProdutoById(id);
		if (produto != null) {
			return ResponseEntity.ok(produto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Produto>> findAllUsuarioscontrol() {
		List<Produto> produto = produtoService.getAllProduto();
		return ResponseEntity.ok(produto);
	}

	@PostMapping("/")
	public ResponseEntity<Produto> insertUsuariosControl(@RequestBody Produto produto) {
		Produto novoProduto = produtoService.saveProduto(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
	}

}

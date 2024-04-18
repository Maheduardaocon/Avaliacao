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

import com.example.demo.entities.Pedido;
import com.example.demo.services.PedidoService;

@RestController
@RequestMapping("/Pedido")
public class PedidoController {

	private final PedidoService pedidoService;

	
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> findPedidobyId(@PathVariable Long id) {
		Pedido pedido = pedidoService.getPedidoById(id);
		if (pedido != null) {
			return ResponseEntity.ok(pedido);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Pedido>> findAllUsuarioscontrol() {
		List<Pedido> pedido = pedidoService.getAllPedido();
		return ResponseEntity.ok(pedido);
	}

	@PostMapping("/")
	public ResponseEntity<Pedido> insertUsuariosControl(@RequestBody Pedido pedido) {
		Pedido novoPedido = pedidoService.savePedido(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido);
	}

}



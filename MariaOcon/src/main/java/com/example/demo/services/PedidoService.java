package com.example.demo.services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.example.demo.entities.Pedido;
import com.example.demo.repositories.PedidoRepository;

@Service
public class PedidoService {

	private PedidoRepository pedidoRepository;

    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

	public Pedido getPedidoById(long funcodigo) {
		return pedidoRepository.findById(funcodigo).orElse(null);
	}

	public List<Pedido> getAllPedido() {
		return pedidoRepository.findAll();
	}
		
	}

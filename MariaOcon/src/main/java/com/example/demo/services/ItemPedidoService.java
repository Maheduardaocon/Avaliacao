package com.example.demo.services;

import java.util.List;



import org.springframework.stereotype.Service;


import com.example.demo.entities.ItemPedido;

import com.example.demo.repositories.ItemPedidoRepository;



@Service
public class ItemPedidoService {

	private ItemPedidoRepository itemPedidoRepository;

    public ItemPedido saveItemPedido(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

	public ItemPedido getItemPedidoById(long funcodigo) {
		return itemPedidoRepository.findById(funcodigo).orElse(null);
	}

	public List<ItemPedido> getAllItemPedido() {
		return itemPedidoRepository.findAll();
	}
		

}
    



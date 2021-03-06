package com.cenfotec.clientes.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cenfotec.clientes.model.Cliente;
import com.cenfotec.clientes.model.Orden;
import com.cenfotec.clientes.repository.ClienteRepository;
import com.cenfotec.clientes.repository.OrdenRepository;

public class OrdenController {
	
	private OrdenRepository repository;

	OrdenController(OrdenRepository ordenRepository) {
		this.repository = ordenRepository;
	}

	@GetMapping
	public List findAll() {
		return repository.findAll();
	}

	@GetMapping(path = { "/{idOrden}" })
	public ResponseEntity<Orden> findById(@PathVariable long id) {
		return repository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public Orden create(@RequestBody Orden orden) {
		return repository.save(orden);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Orden> update(@PathVariable("id") long id, @RequestBody Orden orden) {
		return repository.findById(id).map(record -> {
			record.setCantidadItems(orden.getCantidadItems());
			Orden updated = repository.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		return repository.findById(id).map(record -> {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}

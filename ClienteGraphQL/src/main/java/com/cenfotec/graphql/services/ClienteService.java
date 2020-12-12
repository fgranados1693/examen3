package com.cenfotec.graphql.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.graphql.entities.Cliente;
import com.cenfotec.graphql.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepo;

	public List<Cliente> getAllClientes(int count) {
		return this.clienteRepo.findAll().stream().limit(count).collect(Collectors.toList());
	}

	public Optional<Cliente> getCliente(int id) {
		return this.clienteRepo.findById(id);
	}

	public Cliente createCliente(String nombre, String apellido, String direccionResidencia, String direccionCobro,
			int numeroTarjeta, int mesVencimiento, int annoVencimiento) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDireccionResidencia(direccionResidencia);
		cliente.setDireccionCobro(direccionCobro);
		cliente.setNumeroTarjeta(numeroTarjeta);
		cliente.setMesVencimiento(mesVencimiento);
		cliente.setAnnoVencimiento(annoVencimiento);

		return this.clienteRepo.save(cliente);
	}

	public boolean deleteCliente(int id) {
		this.clienteRepo.deleteById(id);
		return true;
	}

}

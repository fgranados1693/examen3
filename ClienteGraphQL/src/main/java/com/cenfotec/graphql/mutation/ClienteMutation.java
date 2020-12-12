package com.cenfotec.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.graphql.entities.Cliente;
import com.cenfotec.graphql.services.ClienteService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ClienteMutation implements GraphQLMutationResolver {

	@Autowired
	private ClienteService clienteService;

	public Cliente createCliente(String nombre, String apellido, String direccionResidencia, String direccionCobro, int numeroTarjeta,
			int mesVencimiento, int annoVencimiento) {
		return this.clienteService.createCliente(nombre, apellido, direccionResidencia, direccionCobro, numeroTarjeta, mesVencimiento,
				annoVencimiento);
	}
}

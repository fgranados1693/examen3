package com.cenfotec.clientes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo;
	private int precio;
	
////	@ManyToOne
////    @JoinColumn(name="idOrden", nullable=false)
////	private Orden Orden;
//
//	public Item(Long id, String tipo, int precio, com.cenfotec.clientes.model.Orden orden) {
//		super();
//		this.id = id;
//		this.tipo = tipo;
//		this.precio = precio;
//		Orden = orden;
//	}
//	public Item() {
//		super();
//	}
	
}

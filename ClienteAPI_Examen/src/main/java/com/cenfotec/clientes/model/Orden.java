package com.cenfotec.clientes.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int cantidadItems;
	private String pathImagen;
	
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="Orden")
//	private Set<Item> item;
//
//	public Set<Item> getItems() {
//		return items;
//	}
//	public void setProductos(Set<Item> items) {
//		this.items = items;
//	}
//	public Orden(Long id, String cantidadItems, String pathImagen, Set<Item> items) {
//		super();
//		this.id = id;
//		this.cantidadItems = cantidadItems;
//		this.pathImagen = pathImagen;
//		this.items = items;
//	}
	
}

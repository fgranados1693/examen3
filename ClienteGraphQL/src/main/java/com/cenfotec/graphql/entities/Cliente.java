package com.cenfotec.graphql.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import lombok.Data;
//import lombok.EqualsAndHashCode;

//@Data
//@EqualsAndHashCode
@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "direccionResidencia")
	private String direccionResidencia;
	
	@Column(name = "direccionCobro")
	private String direccionCobro;
	
	@Column(name = "numeroTarjeta")
	private int numeroTarjeta;
	
	@Column(name = "mesVencimiento")
	private int mesVencimiento;
	
	@Column(name = "annoVencimiento")
	private int annoVencimiento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public String getDireccionCobro() {
		return direccionCobro;
	}

	public void setDireccionCobro(String direccionCobro) {
		this.direccionCobro = direccionCobro;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public int getMesVencimiento() {
		return mesVencimiento;
	}

	public void setMesVencimiento(int mesVencimiento) {
		this.mesVencimiento = mesVencimiento;
	}

	public int getAnnoVencimiento() {
		return annoVencimiento;
	}

	public void setAnnoVencimiento(int annoVencimiento) {
		this.annoVencimiento = annoVencimiento;
	}
	
}

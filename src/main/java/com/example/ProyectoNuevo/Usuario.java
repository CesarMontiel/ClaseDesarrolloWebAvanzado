package com.example.ProyectoNuevo;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios", schema = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {
	@Id
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@JsonIgnore
	@ManyToOne
	@jakarta.persistence.JoinColumn(name = "id_coordinacion")
	private Institucion institucion;
}

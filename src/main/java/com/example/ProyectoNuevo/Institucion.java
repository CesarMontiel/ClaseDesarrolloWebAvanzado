package com.example.ProyectoNuevo;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "institucion", schema = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Institucion {
	@Id
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "institucion")
	private List<Usuario> usuarios;
}

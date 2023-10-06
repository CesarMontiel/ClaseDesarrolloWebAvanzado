package com.example.ProyectoNuevo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerUsuarios {
	@Autowired
	private MyServicio servicio;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return servicio.getUsuarios();
	}
	@GetMapping("/usuarios/{id}")
	public Usuario getUsuario(@PathVariable int id) {
		return servicio.getUsuario(id);
	}
	
	@PostMapping("/usuarios")
	public boolean insertUsuario(@RequestBody Usuario usuario) {
		return servicio.insertUsuario(usuario);
	}
	
	@PutMapping("/usuarios")
	public boolean updateUsuario(@RequestBody Usuario usuario) {
		return servicio.updateUsuario(usuario);
	}
	
	@DeleteMapping("/usuarios")
	public boolean deleteUsuario(@RequestBody Usuario usuario) {
		return servicio.deleteUsuario(usuario);
	}
	

	@GetMapping("/instituciones")
	public List<Institucion> getInstituciones() {
		return servicio.getInstituciones();
	}
	
	@PostMapping("/instituciones")
	public boolean insertInstitucion(@RequestBody Institucion institucion) {
		return servicio.insertInstitucion(institucion);
	}
	
}

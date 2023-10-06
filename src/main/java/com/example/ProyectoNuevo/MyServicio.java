package com.example.ProyectoNuevo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServicio {
	
	@Autowired
	private RepositorioUsuario usuariosRepo;

	@Autowired
	private RepositorioInstitucion institucionesRepo;
	
	
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = usuariosRepo.findAll();
		return usuarios;
	}
	public Usuario getUsuario(int id){
		Usuario usuario = usuariosRepo.findById(id).orElse(null);
		return usuario;
	}
	
	public boolean insertUsuario(Usuario usuario) {
		try {
			Institucion i =institucionesRepo.findById(usuario.getInstitucion().getId()).orElse(null);
			if(i!=null)
				usuario.setInstitucion(i);
			usuariosRepo.save(usuario);
		} catch (Exception e) {
			System.out.print("Error al insertar");
			return false;
		}
		return true;
	}
	public boolean updateUsuario(Usuario usuario) {
		try {
			Usuario u = usuariosRepo.findById(usuario.getId()).orElse(null);
			if(u==null) throw new Exception();
			usuariosRepo.save(usuario);
		} catch (Exception e) {
			System.out.print("Error al insertar");
			return false;
		}
		return true;
	}
	public boolean deleteUsuario(Usuario usuario) {
		try {
			Usuario u = usuariosRepo.findById(usuario.getId()).orElse(null);
			if(u == null) throw new Exception("Usuario no existente");
			usuariosRepo.delete(usuario);
		} catch (Exception e) {
			System.out.print("Error al insertar");
			return false;
		}
		return true;
	}
	
	public List<Institucion> getInstituciones(){
		List<Institucion> instituciones = institucionesRepo.findAll();
		return instituciones;
	}
	
	public boolean insertInstitucion(Institucion institucion) {
		try {
			institucionesRepo.save(institucion);
		} catch (Exception e) {
			System.out.print("Error al insertar");
			return false;
		}
		return true;
	}
	public boolean updateUsuario(Institucion institucion) {
		try {
			Institucion u = institucionesRepo.findById(institucion.getId()).orElse(null);
			if(u==null) throw new Exception();
			institucionesRepo.save(institucion);
		} catch (Exception e) {
			System.out.print("Error al insertar");
			return false;
		}
		return true;
	}
	public boolean deleteUsuario(Institucion institucion) {
		try {
			institucionesRepo.delete(institucion);
		} catch (Exception e) {
			System.out.print("Error al insertar");
			return false;
		}
		return true;
	}
}

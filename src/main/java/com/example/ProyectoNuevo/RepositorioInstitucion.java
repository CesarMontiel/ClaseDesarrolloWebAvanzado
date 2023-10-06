package com.example.ProyectoNuevo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioInstitucion extends JpaRepository<Institucion, Integer>{

}

DROP SCHEMA IF EXISTS inventario CASCADE;
CREATE SCHEMA IF NOT EXISTS inventario;
GRANT ALL PRIVILEGES ON SCHEMA inventario TO "postgres";

DROP TABLE IF EXISTS inventario.usuarios;

CREATE TABLE inventario.institucion(
	id serial,
	nombre varchar,
	CONSTRAINT pk_institucion PRIMARY KEY(id)
);

CREATE TABLE inventario.usuarios(
	id serial,
	nombre varchar,
	apellido varchar,
	institucion varchar,
	id_coordinacion integer,
	CONSTRAINT pk_usuarios PRIMARY KEY(id),
	FOREIGN KEY (id_coordinacion) REFERENCES inventario.institucion
);

CREATE TABLE inventario.equipo_informatico(
	id serial,
	nombre varchar,
	codigo varchar,
	modelo varchar,
	descripcion varchar,
	CONSTRAINT pk_einformatico PRIMARY KEY(id)
);

CREATE TABLE inventario.equipo_material(
	id serial,
	nombre varchar,
	codigo varchar,
	caracteristicas varchar,
	descripcion varchar,
	CONSTRAINT pk_ematerial PRIMARY KEY(id)
);

CREATE TABLE inventario.prestamos(
	id serial,
	id_usuario integer,
	id_equipo_informatico integer,
	id_equipo_material integer,
	tipo varchar,
	FOREIGN KEY (id_usuario) REFERENCES inventario.usuarios,
	FOREIGN KEY (id_equipo_informatico) REFERENCES inventario.equipo_informatico,
	FOREIGN KEY (id_equipo_material) REFERENCES inventario.equipo_material
);

select * from inventario.institucion;
select * from inventario.usuarios;
select * from inventario.equipo_informatico;
select * from inventario.equipo_material;
select * from inventario.prestamos;

create table USUARIO_Usuario (
	uuid_ VARCHAR(75) null,
	usuarioId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(100) null,
	apellidos VARCHAR(75) null,
	correo VARCHAR(75) null,
	fecha DATE null
);
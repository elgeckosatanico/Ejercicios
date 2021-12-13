/*Eliminar la base de datos que tenga el mismo nombre*/
drop schema if exists 'fes_aragon';

/*Crear base de datos*/
create schema if not exists 'fes_aragon' default character set utf8 collate utf8_spanish2_ci;

/*Seleccionar la base de datos*/
USE 'fes_aargon';

/*Crear una tabla*/
CREATE TABLE 'ALUMNO'(
    'nombre_alumno' text not null,
    'carrera' text not null,
    'no_cuenta' int (10) not null,
    'direccion' text not null,
    'telefono' varchar (8) not null,
    'email' text not null,
    'password' varchar (8) not null,
    'fecha_registro' datetime not null default current_timestamp,
    'permiso' int (11) not null default '1'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Agregar un registro*/

insert into 'ALUMNO'( 'nombre_alumno','carrera',
    'no_cuenta','direccion','telefono','email',
    'password' ,'fecha_registro',
)values('Emmanuel','ico','3336666','Enrique segobiano'
'cualquiercorre@gmsil.com','12345678');

/*Definir primary key*/

alter table 'ALUMNO'
    add primary key('no_cuenta');
commit;

/*Los cambios son de manera permanente*/
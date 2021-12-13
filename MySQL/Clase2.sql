
-- drop database if exists curso;
-- create database if not exits curso;


-- Tipos de datos

-- enteros
-- tinyint -127 to 128 (unsignded : solo valor positivo)
-- smallint -32000 to 32000
-- mediumint 5,000,000
-- int or integer
-- beigint 

-- decimales
-- float (6,2)
-- double
-- decimal *mayor precision 

-- cadenas
-- char (100)
-- varchar (255-65,534)
-- text 

-- fecha
-- date AAAA-MM-DD
-- datetime AAAA-MM-DD HH:MM:SS  
-- time HH:MM:SS
-- on update current_timestamp
-- year

#Indice 

-- primary
-- index
-- unique

#Agregar index

-- alter table 'nombre_tabla' add 'nombre_id' ('nombre_campo');
-- alter table 'nombre_tabla' drop 'nombre_id' ('nombre_campo');

#Renombrar tabla

-- alter table 'nombre_tabla' rename 'nuevo_nombre';
-- rename table 'nombre_tabla' to 'nuevo_nombre';

#Llaves foraneas

-- foreing key('nombre_llave') reference 'nombre_tabla' (id);

#variables de usuario
 
# @nombrevariable:= 
# int nombrevarible
 #$variable

-- Mostrar bases de datos
show databases;

-- Crear base de datos
create database curso;

-- Usar base de datos
use curso;

-- Crear tablas
create table usuario(

nombre varchar(50),
edad int(100)

);

-- Mostrar tablas
show tables;

-- Describir tablas
desc usuario;
desc producto;
desc alumno;

-- Crear tabla producto

create table producto(
nombre int not null,
cantidad int not null,
primary key(nombre));

create table alumno(
nombre varchar(50) not null,
apellido varchar(50) not null,
direccion varchar(50),
telefono int(8),
edad int(99) 
);

insert into alumno(nombre,apellido,direccion,telefono,edad) values('Gabbie','Carter','enrique segobiano','25962162','20');

insert into alumno values('Lisa','Ann','W.DC','25962163','47');

select * from actriz;

create table if not exists actriz(
id_actriz int unsigned auto_increment not null,
nombre varchar(50) not null,
apellido varchar(50) not null,
nacionalidad varchar(50) not null,
edad int(99) not null,
estatura int(50) not null,
primary key(id_actriz),
unique uq_actriz(id_actriz)
);

-- insertar valores en la tabla
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento) values('Ava','Addams','Francia','41','1.60','1979');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento) values('Kendra','Lust','E.U','42','1.62','1978');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Lisa','Ann','E.U','48','1.57','1972');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Ariella','Ferrera','Colombia','42','1.70','1979');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Chanel','Preston','E.U','35','1.73','1985');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Carter','Cruise','E.U','29','1.62','1991');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Natalia','Starr','Polonia','28','1.75','1993');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Rachel','Starr','E.U','37','1.63','1983');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Karlee','Grey','E.U','27','1.67','1994');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Keisha','Grey','E.U','26','1.57','1994');
insert into actriz(nombre,apellido,nacionalidad,edad,estatura,a_nacimiento)values('Mia','Melano','E.U','20','1.80','2000');
insert into actrices values('Kendra','Sunderland','E.U','25','1.75','1995','12');
insert into actrices values('Valentina','Nappi','Italia','30','1.65','1991');
insert into actrices values('Marica','Chanelle','Italia','25','1.75','1997');
insert into actrices values('Luna','Star','Cuba','31','1.63','1992');
insert into actrices values('Riley','Reid','E.U','30','1.63','1991');
insert into actrices values('Lena','Paul','E.U','27','1.63','1994');
insert into actrices values('Kissa','Sins','E.U','34','1.55','1986');
insert into actrices values('Katrina','Jade','E.U','27','1.60','1994');


select * from actrices;
desc actriz;

alter table actrices change nacionalidad pais varchar(50) not null;
alter table actriz change estatura estatura decimal(6,2) not null;
alter table actrices change id_actriz id_actriz varchar(100);

-- borrar un registro
delete from actriz where nombre = 'Ava';

-- agregar una columna a una tabla
alter table actriz add column a_nacimiento varchar(50) not null;
alter table actrices add column id_actriz int (100) not null;
alter table actrices add column id_actriz int unsigned auto_increment not null after nombre;

-- borrar columna
alter table actrices drop column id_actriz;

-- modificar columna
alter table actriz modify nombre varchar(100) not null;

-- actualizar un registro
update actrices set a_nacimiento = '1979' where nombre = 'Ava';
update actrices set estatura = '1.76' where nombre = 'Natalia';
update actrices set estatura = '1.63' where nombre = 'Rachel';
update actrices set id_actriz = 1 where nombre = 'Ava';
update actrices set id_actriz = 2 where nombre = 'Kendra';

-- operadores logicos
select nombre , apellido , a_nacimiento , pais from actrices where pais = 'E.U';
select nombre , apellido , a_nacimiento , pais from actrices where pais <> 'E.U';
select nombre , apellido , a_nacimiento , pais , edad from actrices where edad > '29';
select nombre , apellido ,  pais , edad , estatura from actrices where estatura > '1.70';

-- Mostrar indice
show index from actrices;

-- Eliminar indice 
drop index id_actriz on actrices;


-- clave primaria
alter table actrices add primary key (id_actriz);
-- alter table 'nombre' modify 'nombre_id' int unsigned auto_increment not null;

truncate table actriz;

create table if not exists elemplo1(
id int unsigned auto_increment,
titulo varchar(40) not null,
editorial varchar(40),
autor varchar(30) default 'Desconocido',
precio decimal(5,2) unsigned default 8.25,
cantidad mediumint unsigned not null,
primary key(id)
);

desc elemplo1;

insert into elemplo1(titulo,editorial,autor,precio,cantidad ) values('el principito','no me acuerdo','un pibe frances','15.5','2');
insert into elemplo1(titulo,editorial,autor,cantidad ) values('rebelion en la granja','no me acuerdo','george orwell','15');

select * from elemplo1;

create table if not exists productos
(id integer unsigned not null auto_increment,
nombre varchar(50),
proveedor varchar(50),
descripcion text,
precio decimal(6,2) unsigned,
cantidad smallint unsigned,
primary key(id)
);

insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Laptop HP','HP','Las mejores laptop',155.69,50);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Mouse','Logitech','Las mejores mouse',20.86,30);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Teclado','Logitech','Las mejores teclados',80.12,100);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Laptop DELL','Dell','Las mejores laptop',200.8,15);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Pantalla','HP','Las mejores Pantallas',155.69,50);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Impresora','HP','Las mejores Impresoras',155,70);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Camaras','logitech','Las mejores Camaras',500,20);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Xbox 360','Xbox Microsoft','Las mejores Consolas',103,10);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('PlayStation 4','Sony','Las mejores play',15.69,50);
insert into productos(nombre, proveedor, descripcion, precio, cantidad) values('Lenovo 310','Lenovo','Las mejores laptop',155.69,50);

select nombre,precio,cantidad from productos;

select nombre,precio,cantidad, precio*cantidad monto from productos;

select nombre,precio,cantidad, precio*0.1 '10%', precio-(precio*0.1) precio_rebaja from productos;

select concat('hola','','como stas?');
select concat_ws('Miguel','Lopez','Martinez');
select length('Hola a todos');
select left('buenos dias',8);
select ltrim('Udemy');
select replace('xxx','x','w');
select repeat('sql','3');
select reverse('ANNA');
select lower('HOLA COMO ESTAN');
select upper('hola como estan');

);

select ceiling(12.5);
select ceiling(precio) from productos;
select floor(precio) from productos;
select power(precio,3) from productos;

select nombre,descripcion,precio,cantidad from productos order by nombre;
select nombre,descripcion,precio,cantidad from productos order by nombre desc;
select nombre,descripcion,precio,cantidad from productos order by 2;

select * from productos where (proveedor = 'HP') and (precio <= 200 ) and (nombre = 'pantalla');
select * from productos where (proveedor = 'HP') or (precio <= 200 );
select * from productos where (proveedor = 'HP') xor (precio <= 200 );
select * from productos where not (precio <= 200 );

select * from productos where precio >= 100 and precio <= 150;
select * from productos where precio between 100 and 150;
select * from productos where proveedor in('HP','La mejor laptop');

select * from productos where descripcion like '%laptop%';
select * from productos where proveedor regexp 'log';
select * from productos where proveedor regexp '[h]';
select * from productos where proveedor regexp '[a-f]';

select count(*) from productos;

select sum(cantidad) from productos where proveedor = 'HP';
select max(precio) from productos;
select min(precio) from productos;

create table visitantes(
  nombre varchar(30),
  edad tinyint unsigned,
  sexo char(1),
  domicilio varchar(30),
  ciudad varchar(20),
  telefono varchar(11),
  montocompra decimal (6,2) unsigned
 );

insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Susana Molina', 28,'f','Colon 123','Cordoba',null,45.50); 
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Marcela Mercado',36,'f','Avellaneda 345','Cordoba','4545454',0);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Alberto Garcia',35,'m','Gral. Paz 123','Alta Gracia','03547123456',25); 
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Teresa Garcia',33,'f','Gral. Paz 123','Alta Gracia','03547123456',0);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Roberto Perez',45,'m','Urquiza 335','Cordoba','4123456',33.20);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Marina Torres',22,'f','Colon 222','Villa Dolores','03544112233',25);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Julieta Gomez',24,'f','San Martin 333','Alta Gracia','03547121212',53.50);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Roxana Lopez',20,'f','Triunvirato 345','Alta Gracia',null,0);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Liliana Garcia',50,'f','Paso 999','Cordoba','4588778',48);
insert into visitantes (nombre,edad, sexo,domicilio,ciudad,telefono,montocompra)
  values ('Juan Torres',43,'m','Sarmiento 876','Cordoba','4988778',15.30);
  

select count(*) from visitantes where ciudad='Cordoba';
select count(*) from visitantes where ciudad = 'Alta Gracia';

select ciudad , count(*) from visitantes group by ciudad;

select distinct proveedor from productos; 

create table if not exists libro(
id int unsigned auto_increment not null,
titulo varchar(100),
autor varchar(50),
descripcion text,
editorial varchar(15),
primary key(id)
);

create table if not exists libros(
id int unsigned auto_increment not null,
titulo varchar(100),
autor varchar(50) not null,
descripcion text,
editorial varchar(15) not null,
primary key(id),
index i_autoreditorial (autor, editorial)
);

show index from libros2;

create table if not exists libros2(
id int unsigned auto_increment not null,
titulo varchar(100),
autor varchar(50) not null,
descripcion text,
editorial varchar(15) not null,
primary key(id),
index i_autor(autor),
unique uq_titulo(titulo)
);

insert into libros2(titulo, autor, editorial) values('Java en 10 minutos', 'Alejandro', 'La Maravilla');
insert into libros2(titulo, autor, editorial) values('Java', 'Alejandro', 'La Maravilla');
insert into libros2(titulo, autor, editorial) values('C', 'Alejandro', 'La rosa linda');

select * from libros2;

create table if not exists productos2(
id int unsigned not null auto_increment,
nombre varchar(50) not null,
descripcion text,
proveedorid int unsigned not null,
precio decimal(5,2),
cantidad smallint unsigned default 0,
primary key(id),
unique index (nombre),
foreign key(proveedorid) references proveedor(id)
);

create table if not exists proveedor(
id int unsigned not null auto_increment,
nombre varchar(50),
primary key(id),
unique index (nombre)
);

insert into proveedor (nombre) values('Lenovo');
insert into proveedor (nombre) values('Logitech');
insert into proveedor (nombre) values('Microsoft'); 
insert into proveedor (nombre) values('HP');

insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('Lenovo 310', 'La mejor laptop', 1, 100, 50);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('Mouse', 'mouse inalambrico', 2, 15.96, 5);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('Office 360', 'Paquete de Ofice', 3, 150.69, 30);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('HP Y700', 'La mejor laptop del mercado', 4, 10, 15);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('Alfombra Lenovo', 'Alfombras asombrosas', 1, 300, 40);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('laptop HP 1000', 'No funciona muy bien',4 , 500, 3);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('Volante Gamer', 'El mejor volante para jugar', 2, 800, 5);
insert into productos2(nombre, descripcion, proveedorid, precio, cantidad) 
values('Disco duro', 'Obten mas capacidad', 3, 70, 80);

select * from proveedor;
select * from productos2;
desc proveedor;
desc productos2;

#Estructura del Join basico
select * from productos2
join proveedor
on productos2.proveedorid=proveedor.id;

select p.nombre, p.descripcion, p.precio, pro.nombre 
from productos2 as p
join proveedor as pro
on p.proveedorid=pro.id;

#Left Join
select * from proveedor
left join productos2
on proveedor.id=productos2.proveedorid;

#Right join
select * from proveedor
right join productos2
on proveedor.id=productos2.proveedorid;

#Inner Join
select p.nombre, p.descripcion, p.precio, pro.nombre from proveedor as pro
inner join productos2 as p
on pro.id=p.proveedorid;

select p.nombre, p.descripcion, p.precio, pro.nombre from proveedor as pro
straight_join productos2 as p
on pro.id=p.proveedorid;

#Funciones de agrupamiento group by
select pro.nombre, count(p.proveedorid) as 'Cantidad de Productos'
from proveedor as pro
join productos2 as p
on pro.id=p.proveedorid
group by pro.nombre;

select pro.nombre, max(p.precio) as 'Mayor Precio'
from proveedor as pro
left join productos2 as p
on p.proveedorid=pro.id
group by pro.nombre;

create table libros3(
  codigo int unsigned auto_increment,
  titulo varchar(40) not null,
  autor varchar(20) default 'Desconocido',
  primary key (codigo)
 );

create table socios(
  documento char(8) not null,
  nombre varchar(30),
  domicilio varchar(30),
  primary key (documento)
 );

 create table prestamos(
  documento char(8) not null,
  codigolibro int unsigned,
  fechaprestamo date not null,
  fechadevolucion date,
  primary key (codigolibro,fechaprestamo)
 );
 
 insert into socios values('22333444','Juan Perez','Colon 345');
 insert into socios values('23333444','Luis Lopez','Caseros 940');
 insert into socios values('25333444','Ana Herrero','Sucre 120');

 insert into libros3 values(1,'Manual de 2º grado','Molina Manuel');
 insert into libros3 values(25,'Aprenda PHP','Oscar Mendez');
 insert into libros3 values(42,'Martin Fierro','Jose Hernandez');

 insert into prestamos values('22333444',1,'2016-08-10','2016-08-12');
 insert into prestamos values('22333444',1,'2016-08-15',null);
 insert into prestamos values('25333444',25,'2016-08-10','2016-08-13');
 insert into prestamos values('25333444',42,'2016-08-10',null);
 insert into prestamos values('25333444',25,'2016-08-15',null);
 insert into prestamos values('30333444',42,'2016-08-02','2016-08-05');
 insert into prestamos values('25333444',2,'2016-08-02','2016-08-05');
 
 select * from prestamos;
 
 select nombre, titulo, fechaprestamo
 from prestamos as p
 join socios as s
 on s.documento=p.documento
 join libros3 as l
 on codigolibro=codigo;
 
 select nombre, titulo, fechaprestamo
 from prestamos as p
 left join socios as s
 on p.documento=s.documento
 left join libros3 as l
 on l.codigo=codigolibro;
 
 select nombre, titulo, fechaprestamo
 from prestamos as p
 left join socios as s
 on p.documento=s.documento
 join libros3 as l
 on p.codigolibro=l.codigo;
 
 select pro.nombre,
 if(count(p.proveedorid)>0, 'SI', 'NO') as hay
 from proveedor as pro
 left join productos2 as p
 on pro.id=p.proveedorid
 group by pro.nombre;
 
select pro.nombre,
 case count(p.proveedorid) when 0 then 'NO'
 else 'SI' end as 'Hay'
 from proveedor as pro
 left join productos2 as p
 on pro.id=p.proveedorid
 group by pro.nombre;
 
 select @preciomayor:=max(precio) from productos2;
 select * from productos2 where precio=@preciomayor;
 
 select p.nombre, p.descripcion, pro.nombre
 from productos2 as p
 join proveedor as pro
 on p.proveedorid=pro.id
 where p.precio = @preciomayor;
 
 CREATE DATABASE IF NOT EXISTS vistas;
USE vistas;

 create table secciones(
  codigo int auto_increment primary key,
  nombre varchar(30),
  sueldo decimal(5,2)
 );

 create table empleados(
  legajo int primary key auto_increment,
  documento char(8),
  sexo char(1),
  apellido varchar(40),
  nombre varchar(30),
  domicilio varchar(30),
  seccion int not null,
  cantidadhijos int,
  estadocivil char(10),
  fechaingreso date
 );
 
insert into secciones(nombre,sueldo) values('Administracion', 300);
 insert into secciones(nombre,sueldo) values('Contaduría', 400);
 insert into secciones(nombre,sueldo) values('Sistemas', 500);

 insert into empleados (documento,sexo,apellido,nombre,domicilio,seccion,cantidadhijos,estadocivil,fechaingreso)
   values ('22222222','f','Lopez','Ana','Colon 123',1,2,'casado','2010-10-10');
 insert into empleados (documento,sexo,apellido,nombre,domicilio,seccion,cantidadhijos,estadocivil,fechaingreso)   
   values('23333333','m','Lopez','Luis','Sucre 235',1,0,'soltero','2010-02-10');
 insert into empleados (documento,sexo,apellido,nombre,domicilio,seccion,cantidadhijos,estadocivil,fechaingreso)
   values('24444444','m','Garcia','Marcos','Sarmiento 1234',2,3,'divorciado','2018-07-12');
 insert into empleados (documento,sexo,apellido,nombre,domicilio,seccion,cantidadhijos,estadocivil,fechaingreso)
   values('25555555','m','Gomez','Pablo','Bulnes 321',3,2,'casado','2018-10-09');
 insert into empleados (documento,sexo,apellido,nombre,domicilio,seccion,cantidadhijos,estadocivil,fechaingreso)
   values('26666666','f','Perez','Laura','Peru 1254',3,3,'casado','2019-05-09');
   
   
-- create view NOMBREVISTA as SENTENCIASSELECT from TABLA;
   
create view vista_empleado as select concat(apellido, ' ', e.nombre) as nombre, sexo, s.nombre as seccion,
cantidadhijos from empleados as e join secciones as s on codigo=seccion;

select * from vista_empleado;

select seccion, count(*) as cantidad from vista_empleado group by seccion;

create view vista_empleado_ingreso (fecingreso,cantidad) as select extract(year from fechaingreso) as
fecingreso, count(*) as cantidad from empleados group by fecingreso;

select * from vista_empleado_ingreso;

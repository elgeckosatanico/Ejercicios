

create database inmobiliaria;
use inmobiliaria;
show tables;
desc clientes;
select * from clientes;

create table clientes(
      id_clientes INT NOT NULL auto_increment,
      rfc varchar(13) NOT NULL,
      tel_fijo varchar(8) NOT NULL,
      celular varchar(10) NOT NULL,
      nombre varchar(100),
      a_paterno varchar(100) NOT NULL,
      a_materno varchar(100) NOT NULL,
      PRIMARY KEY(id_clientes),
      UNIQUE KEY(rfc)
);


alter table clientes change celular celular varchar(10);
alter table clientes change tel_fijo tel_fijo varchar(8);
alter table clientes change nombre nombre varchar(100) NOT NULL;

create table trabajadores(
      id_trabajadores INT NOT NULL auto_increment,
      rfc varchar(13) NOT NULL,
      tel_fijo varchar(8) NOT NULL,
      celular varchar(10) NOT NULL,
      nombre varchar(100),
      a_paterno varchar(100) NOT NULL,
      a_materno varchar(100) NOT NULL,
      PRIMARY KEY(id_trabajadores),
      UNIQUE KEY(rfc)
);

desc trabajadores;

alter table trabajadores change celular celular varchar(10);
alter table trabajadores change tel_fijo tel_fijo varchar(8);
alter table trabajadores change nombre nombre varchar(100) NOT NULL;

create table departamento(
      id_dep INT NOT NULL auto_increment,
      id_clientes INT NOT NULL,
      codigo_dep varchar(13) NOT NULL,
      tipo varchar(15),
      metros INT,
      descripcion varchar(300),
      direccion varchar(300) NOT NULL,
      espacio varchar(300),
      PRIMARY KEY(id_dep),
      UNIQUE KEY(codigo_dep),
      foreign key(id_clientes) references clientes(id_clientes)
);

alter table departamento add column estado varchar(50) not null after tipo;

desc departamento;

create table locales(
      id_loc INT NOT NULL auto_increment,
      id_clientes INT NOT NULL,
      codigo_loc varchar(13) NOT NULL,
      num_serv INT,
	  servicios varchar(50),
      valor_serv INT,
      metros INT,
      descripcion varchar(300),
      direccion varchar(300) NOT NULL,
      espacio varchar(300),
      PRIMARY KEY(id_loc),
      UNIQUE KEY(codigo_loc),
      foreign key(id_clientes) references clientes(id_clientes)
);

alter table locales add column estado varchar(50) not null after valor_serv;

desc locales;

create table bodega(
      id_bod INT NOT NULL auto_increment,
      id_clientes INT NOT NULL,
      id_loc INT,
      id_dep INT,
      codigo_bod varchar(13) NOT NULL,
      num INT,
      seccion INT,
      metros INT,
      descripcion varchar(300),
      direccion varchar(300) NOT NULL,
      espacio varchar(300),
      PRIMARY KEY(id_bod),
      UNIQUE KEY(codigo_bod),
      foreign key(id_clientes) references clientes(id_clientes),
      foreign key(id_dep) references departamento(id_dep),
      foreign key(id_loc) references locales(id_loc)
);

alter table bodega add column estado varchar(50) not null after seccion;
desc bodega;

create table otro(
      id_o INT NOT NULL auto_increment,
      id_clientes INT NOT NULL,
      codigo_o varchar(13) NOT NULL,
      metros INT,
      descripcion varchar(300),
      direccion varchar(300) NOT NULL,
      espacio varchar(300),
      PRIMARY KEY(id_o),
      UNIQUE KEY(codigo_o),
      foreign key(id_clientes) references clientes(id_clientes)
);
alter table otro add column estado varchar(50) not null after codigo_o;
desc otro;

create table pago(
	  id_pago INT NOT NULL auto_increment,
      id_clientes INT NOT NULL,
      codigo varchar(13) NOT NULL,
      valor_oper INT,
      descripcion varchar(300),
      fecha datetime,
      PRIMARY KEY(id_pago),
      foreign key(id_clientes) references clientes(id_clientes)
);


desc pago;

create table renta(
	  id_renta INT NOT NULL auto_increment,
      id_clientes INT NOT NULL,
      codigo varchar(13) NOT NULL,
      valor_oper INT,
      periodo_in datetime,
      periodo_fin datetime,
      PRIMARY KEY(id_renta),
      foreign key(id_clientes) references clientes(id_clientes)
);
alter table renta drop column fecha;
desc renta;
drop table renta;

create table bitacora(
      id_bitacora INT NOT NULL auto_increment,
	  id_clientes INT NOT NULL,
      accion varchar(20),
      valor_oper INT,
      fecha datetime,
      PRIMARY KEY(id_bitacora),
      foreign key(id_clientes) references clientes(id_clientes)
);

desc bitacora;

select * from departamento;
select * from locales;
select * from bodega;
select * from otro;

insert into departamento values(2002,1051,'A-C-45','De Lujo','venta',35,null,'CHINALHUACAN EDO.MEXICO',null);
insert into locales values (3003,1066,'L001',3,'luz,agua,drenaje',3000,'renta',34,'','','');
insert into bodega values (4004,111,null,null,'B002',33,12,'renta',60,'','','');
insert into otro values(5002,1067,'A0012','venta',1000,'terreno','SAN.BUENAVENTURA CHALCO','imagen11.jepg');
insert into departamento values (null,555,'R-C-45','Residencial','venta',35,null,'IXTAPALUCA EDO.MEXICO',null);
insert into locales values (null,1057,'L123',1,'luz',1000,'renta',25,null,'IXTAPALUCA EDO.MEXICO',null);
insert into bodega values (null,1066,3003,null,'BL001',1,1,'renta',12,'','','imagen2.jpg');
insert into otro values(5101,1069,'B8976','venta',1550,'terreno','',null);
insert into departamento values(null,1054,'R-D-77','Residencial','venta',40,null,'IZTAPALAPA CDMX','imagen1.jpg');
insert into locales values (null,1057,'L124',1,'luz,agua',1500,'renta',30,null,'IXTAPALUCA EDO.MEXICO','sZwr.jepg');

select * from clientes;

insert into clientes values(344,'ROMR7918K6L',null,null,'Ricardo','Rodriguez','Martinez');
insert into clientes values(1051,'FLCM000601CCC',null,'5526752389','Florinda','Chespirito','Meza');
insert into clientes values(null,'PEGP800701KKL','25962162','5567942161','Pablo','Perez','Garcia');
insert into clientes values(null,'GOFA880927CDC',null,'5538993984','Antonia','Gomez','Fernandez');
insert into clientes values(null,'LODR771101H1C','39123126','5538730681','Ricardo Antonio','Lopez','Diaz');
insert into clientes values(null,'GASC801203VB2',null,null,'Claudia','Garcia','Sanchez');
insert into clientes values(null,'ROSL780308Z34','60666311','5533123251','Laura','Romero','Sosa');
insert into clientes values(null,'TOAS890601VB5',null,null,'Sofia','Torres','Alvarez');
insert into clientes values(1066,'RURJ950922AC6','19801836',null,'Jose Maria','Ruiz','Ramirez');
insert into clientes values(null,'FOAM910712BN5','36141952',null,'Melissa','Flores','Acosta');
insert into clientes values(null,'HEMV880710CHC',null,'5562581941','Valentina','Herrera','Medina');
insert into clientes values(null,'ROMD9007123CC',null,'5590429554','Daniela','Rojas','Molina');
insert into clientes values(555,'CAMG940226CC1',null,'5578247269','Gabriel','Castro','Martinez');
insert into clientes values(null,'ROSJ79050555T','29136377',null,'Juan','Rodriguez','Silva');
insert into clientes values(111,'CAVJ891102NMO','43210527','5553261278','Juan Carlos','Castillo','Vera');
insert into clientes values(null,'POJN981001CXC','63215633',null,'Juan Carlos Bodoque','Ponce','Navarro');

select * from trabajadores;


insert into trabajadores values(110,'FLCM000601CCC',null,'5526752389','Florinda','Chespirito','Meza');
insert into trabajadores values(null,'FESA870813LOC',null,'5593166272','Andres','Fernandez','Salcedo');
insert into trabajadores values(null,'POJN981001CXC','63215633',null,'Juan Carlos Bodoque','Ponce','Navarro');
insert into trabajadores values(109,'CATM870821BN3',null,'5594577257','Miguel','Cano','Torres');
insert into trabajadores values(null,'FOAM910712BN5','36141952',null,'Melissa','Flores','Acosta');

select * from pago;
select * from renta;

insert into pago values(100,'111','B002','3000','pago mensual','2020-11-23 13:23:00');
insert into pago values(101,'1066','L001','3000','pago mensual','2016-2-21 14:23:10');
insert into pago values(null,'1066','BL001','3000','pago mensual','2019-3-22 16:27:02');
insert into pago values(null,'1066','BL001','3000','pago mensual','2019-4-9 17:23:40');
insert into pago values(null,'1066','BL001','3000','pago mensual','2019-5-10 13:13:50');
insert into pago values(null,'1066','BL001','3000','pago mensual','2019-6-10 15:02:45');
insert into pago values(null,'1066','BL001','3000','pago mensual','2019-7-11 13:37:34');
insert into pago values(null,1057,'L124','1500','pago mensual','2019-10-11 12:26:02');
insert into pago values(null,1057,'L124','1500','pago mensual','2019-11-11 13:25:02');
insert into pago values(null,1057,'L124','1500','pago mensual','2019-12-12 11:25:02');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-1-11 14:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-2-11 17:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-3-21 14:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-4-11 11:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-5-11 12:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-6-11 13:03:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-7-12 14:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-8-11 15:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-9-20 16:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-10-11 14:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2020-11-11 16:23:10');
insert into pago values(null,1057,'L124','1500','pago mensual','2021-1-1 13:47:55');
insert into pago values(null,1057,'L124','1500','pago mensual','2021-1-21 14:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2019-12-12 11:25:02');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-1-12 14:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-2-12 17:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-3-13 14:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-4-11 11:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-5-13 12:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-6-12 13:03:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-7-12 14:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-8-11 15:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-9-11 16:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-10-11 14:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2020-11-11 16:23:10');
insert into pago values(null,1057,'L123','1000','pago mensual','2021-1-1 13:47:55');
insert into renta values(null,1066,'BL001',3000,'2019-3-22 16:27:02','2019-7-11 13:37:34');
insert into renta values(null,1057,'L124',31500,'2019-9-11 12:25:02','2021-1-1 13:47:55');
insert into renta values(null,1057,'L123',1000,'2019-11-2 17:13:12','2021-1-1 13:47:55');

-- Listar los clientes por orden alfabetico por apellido paterno

select a_paterno apellido_paterno , a_materno apellido_materno , nombre nombre_cliente
from clientes
order by 1;

-- Listar los clientes que hayan registrado telefono fijo o numero celular

select id_clientes, a_paterno, a_materno, nombre cliente , tel_fijo telefono, celular celular
from clientes
where tel_fijo is not null or celular is not null;

-- Listar los pagos que se efectuaron en un dia lunes

set lc_time_names = 'es_ES';
select id_pago , id_clientes , valor_oper coste, dayname(fecha) dia from pago where dayname(fecha) = 'Lunes';

-- Listar los pagos que se efectuaron en un dia lunes junto con el nombre del cliente

select a_paterno, a_materno, nombre cliente, dayname(fecha) dia
from pago p
NATURAL JOIN clientes c
where dayname(fecha) = 'Lunes';

-- Listar los pagos que se efectuaron en los primeros meses del año

select id_pago , id_clientes , valor_oper coste, MONTHNAME(fecha) mes 
from pago where extract(month from fecha)  between 1 and 6;

-- Listar los pagos que se efectuaron un dia martes los ultimos meses del añoptimize

select id_pago , id_clientes , valor_oper coste, MONTHNAME(fecha) mes , dayname(fecha) dia
from pago where (extract(month from fecha)  between 7 and 12) and dayname(fecha) = 'Martes';

-- Listar los pagos realizados junto al nombre del cliente

select c.id_clientes, c.a_paterno, c.a_materno, c.nombre cliente, p.id_pago, p.valor_oper valor
from clientes c
NATURAL JOIN pago p; 

-- Listar tanto trabajadores como clientes

select id_clientes id, rfc rfc, a_paterno paterno, a_materno materno, nombre, 'cliente' tipo
from clientes
UNION
select id_trabajadores, rfc rfc, a_paterno, a_materno, nombre, 'trabajador' tipo
from trabajadores;

-- Crear vista

create or replace view personal as
select id_clientes id, rfc rfc, a_paterno paterno, a_materno materno, nombre, 'cliente' tipo
from clientes
UNION
select id_trabajadores, rfc rfc, a_paterno, a_materno, nombre, 'trabajador' tipo
from trabajadores;

select * from personal;

-- crear vista de departamentos y locales

create or replace view depandloc as
select id_dep id, id_clientes, codigo_dep codigo, metros , descripcion, direccion, 'departamento' tipo
from departamento
UNION
select id_loc, id_clientes, codigo_loc, metros , descripcion, direccion, 'local' tipo
from locales;

select * from depandloc;

-- crear vista de bodega y otros

create or replace view bodando as
select id_bod id, id_clientes, codigo_bod codigo, metros , descripcion, direccion, 'bodega' tipo
from bodega
UNION
select id_o, id_clientes, codigo_o, metros , descripcion, direccion, 'otro' tipo
from otro;

select * from bodando;

-- crear vista inmuebles

create or replace view inmuebles as
select id, id_clientes, codigo, metros , descripcion, direccion, tipo
from depandloc
UNION
select id, id_clientes, codigo, metros , descripcion, direccion, tipo
from bodando;

select * from inmuebles;

-- Listar inmuebles de menos de 20 metros cuadrados

select id, id_clientes, codigo, metros , descripcion, direccion, tipo
from inmuebles
where metros < 20 ;

-- Listar inmuebles mayores de 100 metros cuadrados

select id, id_clientes, codigo, metros , descripcion, direccion, tipo
from inmuebles
where metros > 100 ;

-- Listar inmuebles que no hayan registrado direccion

select id, id_clientes, codigo, metros , descripcion, direccion, tipo
from inmuebles
where direccion = '' ;

-- Listar inmuebles con nombre de clientes

select i.id, i.id_clientes,c.a_paterno, c.a_materno, c.nombre cliente, i.codigo, i.metros , i.descripcion, i.direccion, i.tipo
from clientes c
NATURAL JOIN inmuebles i; 


-- Listar clientes asociados a un local

select i.id, i.id_clientes,c.a_paterno, c.a_materno, c.nombre cliente, i.codigo, i.metros , i.descripcion, i.direccion, i.tipo
from clientes c
NATURAL JOIN inmuebles i
where tipo = 'local'; 

-- Listar clientes asociados a una bodega

select i.id, i.id_clientes,c.a_paterno, c.a_materno, c.nombre cliente, i.codigo, i.metros , i.descripcion, i.direccion, i.tipo
from clientes c
NATURAL JOIN inmuebles i
where tipo = 'bodega'; 

-- Listar clientes que no esten asociados a un departamento

select i.id, i.id_clientes,c.a_paterno, c.a_materno, c.nombre cliente, i.codigo, i.metros , i.descripcion, i.direccion, i.tipo
from clientes c
NATURAL JOIN inmuebles i
where tipo != 'departamento'; 

-- crear vista

create or replace view inmuebleclientes as
select i.id, i.id_clientes,c.a_paterno, c.a_materno, c.nombre cliente, i.codigo, i.metros , i.descripcion, i.direccion, i.tipo
from clientes c
NATURAL JOIN inmuebles i;

select * from inmuebleclientes;

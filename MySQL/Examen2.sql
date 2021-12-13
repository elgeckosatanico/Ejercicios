create database examen2;
use examen2;
create table if not exists accesorios(
cod int not null,
descripcion varchar(300),
fecha datetime,
exist_org int(99) not null ,
precio_lis decimal(10,2) not null,
vendidos int(99) not null,
precio_pub decimal(10,2) not null ,
proveedor varchar(300),
primary key(cod)
);
show tables;
desc accesorios;
select * from accesorios;
insert into accesorios(cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor)
values(8120,'anillo de plata arroba con dos mariposas tous','2009-01-02 10:28:00',2,138.00,1,300.00,'la feria');
insert into accesorios(cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor)
values(8121,'anillo plata mariposas tous size 8','2009-01-18 10:28:00',5,178.00,3,365.00,'karretes');
insert into accesorios(cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor)
values(8122,'anillo de plata ajustable con cuentas','2009-01-08 10:28:00',4,59.00,4,120.00,'biyox');
insert into accesorios(cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor)
values(8123,'anillo ancho placa con encordado de plata size 7 1/2','2009-02-10 10:28:00',2,119.00,1,275.00,'fantmike');
insert into accesorios(cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor)
values(8124,'arete largo popotillo y cuentitas plata con cristal swarosvky','2009-02-18 10:28:00',11,59.00,6,100.00,'la feria');
insert into accesorios(cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor)
values(8125,'aretes de plata mariposa tous','2009-03-01 10:28:00',3,189.00,1,300.00,'la feria');

update accesorios set proveedor = 'karretes' where cod = '8125';

select cod,descripcion,fecha,exist_org,precio_lis,vendidos,precio_pub,proveedor 
from accesorios where extract(month from fecha) = 2;

select * from accesorios where descripcion like '%mariposa%'; 

select  precio_pub * 0.5 from accesorios where proveedor = 'karretes'; 

create table if not exists proveedor(
nombre varchar(300) not null,
cod_prov int not null,
fecha datetime,
descripcion varchar(300),
encargado varchar(300),
primary key(cod_prov)
);
desc proveedor;
alter table proveedor modify fecha varchar(100) not null;
alter table proveedor change fecha mattricula varchar(200) not null;
show tables;
select * from proveedor;
insert into proveedor(nombre,cod_prov,mattricula,descripcion,encargado)
values('biyox',001,'89-04-93-45','La Sonrisa Elegante No 13','Lic. Alicia Flores');
insert into proveedor(nombre,cod_prov,mattricula,descripcion,encargado)
values('FANTMIKE',003,'13-57-91-13','Callejón San Bartolo No. 69','Lic. Silvia Sedas');
insert into proveedor(nombre,cod_prov,mattricula,descripcion,encargado)
values('KARRETES',003,'24-68-10-12','Niño Perdido No 5','Lic. Ana Merezco');
insert into proveedor(nombre,cod_prov,mattricula,descripcion,encargado)
values('LA FERIA',004,'13-69-69-13','Ángeles y Demonios No 666','Lic. Jennifer López');


create database Lanchonete;

use Lanchonete;

create table Clientes(  
   cpf varchar(255) not null primary key, 
   nome varchar(255) not null,
   idade int not null,
   telefone varchar(255) not null
);

create table Lanches(
    id int not null auto_increment primary key,
    nome varchar(255) not null,
    descricao varchar(255) not null, 
    preco decimal (10,2) not null
);

create table Bebidas(
    id int not null auto_increment primary key,
    nome varchar(255) not null,
    preco decimal (10,2) not null
);

create table Pedidos(
   id int not null auto_increment primary key,
   lancheID int,
   bebidaID int,
   clienteID varchar(255) not null,  
   foreign key(lancheID) references Lanches(id),
   foreign key(bebidaID) references Bebidas(id),
   foreign key(clienteID) references Clientes(cpf)
);

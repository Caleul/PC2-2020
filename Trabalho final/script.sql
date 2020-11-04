CREATE DATABASE Chale;

USE Chale;

create table Cliente(
	codCliente
		int
		PRIMARY KEY
		NOT NULL,
	nomeCliente
		varchar(100)
		NOT NULL,
	rgCliente
		varchar(20)
		NOT NULL,
	enderecoCliente
		varchar(100)
		NOT NULL,
	bairroCliente
		varchar(75)
		NOT NULL,
	cidadeCliente
		varchar(75)
		NOT NULL,
	estadoCliente
		varchar(75)
		NOT NULL,
	CEPCliente
		varchar(75)
		NOT NULL,
	nascimentoCliente
		Date
		NOT NULL
);

create table Chale(
	 codChale
		int
		PRIMARY KEY
		NOT NULL,
	localizacao
		varchar(100)
		NOT NULL,
	capacidade
		int
		NOT NULL,
	valorAltaE
		double
		NOT NULL,
	valorBaixaE
		double
		NOT NULL
);

create table Hospedagem(
	codHospedagem
		int
		PRIMARY KEY
		NOT NULL,
	codChale
		int,
	estado
		varchar(50)
		NOT NULL,
	dataInicio
		date
		NOT NULL,
	dataFim
		date
		NOT NULL,
	qtdPessoas
		int
		NOT NULL,
	desconto
		double
		NOT NULL,
	valorFinal
		double
		NOT NULL
);

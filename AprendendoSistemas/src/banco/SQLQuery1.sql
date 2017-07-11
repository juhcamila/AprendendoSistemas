Create database teste

create table estados(
idestado int primary key identity,
nomeEstado varchar(50) not null,
siglaEstado varchar(2) not null
)

create table cidades(
idcidade int primary key identity,
nomeCidade varchar(80) not null,
codEstado int not null,
foreign key(codEstado) references estados(idestado)
)

create table bairro(
idbairro int primary key identity,
nomeBairro varchar(80) not null,
codBairro int not null,
Foreign key (codBairro) references cidades(idcidade)
)

create table telefone(
idtelefone int primary key identity,
numero varchar(15) not null,
codCliente int not null,
codFornecedor int not null,
foreign key (codCliente) references cliente(idcliente),
foreign key(codFornecedor) references fornecedor(idfornecedor)

)

create table cliente(
idcliente int primary key identity,
nomeCliente varchar(80) not null,
endereco varchar(100) not null,
rg varchar(15) not null,
cpf  varchar(15) not null,
codBairro int not null,
codCidade int not null,
foreign key(codBairro) references bairro(idbairro),
foreign key (codCidade) references cidades(idcidade)
)

create table fornecedor(
idfornecedor int primary key identity,
nomeFornecedor varchar(80) not null,
endereco varchar(100) not null,
codBairro int not null,
codCidade int not null,
cnpjFornecedor varchar(30) not null,
foreign key(codBairro) references bairro(idbairro),
foreign key (codCidade) references cidades(idcidade)
)
create table produtos(
idproduto int primary key identity,
nomeProduto varchar(50) not null,
precoVenda decimal(10,2) not null,
precoCompra decimal(10,2) not null,
codFornecedor int not null,
foreign key(codFornecedor) references fornecedor(idfornecedor)
)

create table venda(
idvenda int primary key identity,
dataVenda varchar(10) not null,
valorVenda decimal(10,2) not null,
codCliente int not null,
foreign key (codCliente) references cliente(idcliente)
)

create table itensProdutos(
idvenda int not null,
idproduto int not null,
primary key(idvenda,idproduto),
foreign key (idvenda) references venda(idvenda),
foreign key(idproduto) references produtos(idproduto)
)

select * from estados
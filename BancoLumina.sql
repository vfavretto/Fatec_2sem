/* Tabela CNPJ  */
create table Cnpj (
idEmpresa int identity (1,1) , 
CPF varchar (11),
CNPJ varchar (14) not null,
nomeEmpresa varchar (50) not null,
nomeResp varchar (50),
emailEmpresa varchar (50),
emailResp varchar (50),
telefoneEmpresa varchar (11),
telefoneResp varchar (11),
tipoEmpresa bit,
siteEmpresa varchar (50),
linkedin varchar (50),
instagram varchar (50),
facebook varchar (50),
endereco varchar (50),
UF varchar (2),
cidade varchar (30),
pais varchar (20),
senha varchar (16),
descEmpresa varchar (500),
imgEmpresa varchar (50),
CEP varchar (9),
constraint PK_idEmpresa primary key (idEmpresa)
)

/* Tabela Mensagem */

create table Mensagem (
idMsg int identity (1,1),
idEmpresaEnvia int,
idEmpresaRecebe int,
mensagem varchar (500),
constraint PK_idMsg primary key (idMsg),
constraint FK_idEmpresaEnvia foreign key (idEmpresaEnvia) References Cnpj (idEmpresa),
constraint FK_idEmpresaRecebe foreign key (idEmpresaRecebe) References Cnpj (idEmpresa),
)

/* Tabela Servicos */

create table Servicos(
idServ int identity (1,1),
nomeServ varchar (30),
constraint PK_idServ primary key (idServ)
)

/* Tabela Procura Serviços */

create table Procura_Oferece (
idProc int identity (1,1),
idServ int,
idEmpresa int,
constraint PK_idProc primary key (idProc),
constraint FK_idServ foreign key (idServ) references Servicos (idServ),
constraint FK_idEmpresa foreign key (idEmpresa) references Cnpj (idEmpresa)
)


select * from Cnpj
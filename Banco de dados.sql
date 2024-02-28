/*insert into estado
values
('SP', 'São Paulo');

insert into Cidade
values
('1', 'Votorantim', 'SP');

insert into Cidade (Cocidade, Nomecidade, coestado)
Values('2', 'Sorocaba', 'SP');


insert into estado
values
('NN', 'Não Casdastrado');


insert into Cidade (Cocidade, Nomecidade, coestado)
values ('3', 'Itu', 'NN');

insert into Cidade (Cocidade, Nomecidade, coestado)
Values ('4', 'Itapira', 'NN');


UPDATE Cidade
Set coestado = 'SP'
where coestado = 'NN' 




insert into estado
values
('MG', 'Minas Gerais');


insert into Cidade (Cocidade, Nomecidade, coestado)
values ('5', 'Belo Horizonte', 'MG');



Select * from estado
where cdestado = 'NN'
Select * from Cidade
where coestado = 'MG'


Update Cidade
set coestado = 'NN'
where Nomecidade in ('Itu','Itapira')


delete from estado
where cdestado = 'SP'


insert into estado
values
('SP', 'São Paulo');

insert into Cidade
values
('1', 'Votorantim', 'SP');

insert into Cidade (Cocidade, Nomecidade, coestado)
Values('2', 'Sorocaba', 'SP');

Select * from estado
Select * from Cidade


create table Tb1_Clientes(
codigo int identity (1,1) primary key,
nome varchar (100),
UF varchar (2) );



insert into Tb1_Clientes
(Nome, UF)
Values
('Nicholas', 'RS');


insert into tb1_clientes
(nome, UF)
Values ('Bruce Wayne', 'SP'),
('Tony Stark', 'RS'),
('Diana Prince', 'PR');




update tb1_clientes
set nome = 'Clark Kent'
where codigo = '3'


select IDENT_CURRENT ('tb1_clientes') as Ultimo_registro;


sp_rename 'tb1_clientes', 'Tbl_Clientes';

*/
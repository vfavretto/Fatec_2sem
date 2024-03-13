/*create table Tbl_clientes (
Id int, 
Nome varchar (50), 
Email varchar (100), 
Telefone varchar (15)
Constraint PK_Cliente Primary Key (Id)
)

INSERT into Tbl_clientes
values
('1', 'João Silva', 'joao@email.com', '(11) 1234-5678');
 
 Insert into Tbl_clientes
 values
 ('2', 'Lemmy Kilmister', 'AceofSpades@email.com', '(12) 9876-5432'),
 ('3', 'Cris Cornell', 'BlackHoleSun@email.com', '(13) 2435-4567'),
 ('4', 'Jimmy Hendrix', 'VodooChild@email.com', '(14) 4867-1243'),
 ('5', 'Tim Henson', 'GOAT@email.com', '(15) 5768-3289'),
 ('6', 'Kiko Louleiro', 'NovaEra@email.com', '(17) 1122-3344'),
 ('7', 'Zack DelaRocha', 'RenegadesOfFunk@email.com', '(16) 4864-2654'),
 ('8', 'Pepeu Gomes', 'MisterioDoPlaneta@email.com', '(18) 3344-5566'),
 ('9', 'Eloy Casagrande', 'BeforeIForget@email.com', '(19) 5379-1234'),
 ('10', 'Eric Clapton', 'Layla@email.com', '(20) 1010-2020'),
 ('11', 'David Gilmore', 'TheWall@email.com', '(21) 3232-1313');
 

update Tbl_clientes
set Telefone = '(11) 8765-4321'
where Id = '1'




CREATE table Tbl_Produtos (
Id int, 
Nome varchar (50),
Preco decimal(7,2), 
Estoque int
Constraint PK_Produto Primary Key (Id)
)


INSERT into Tbl_Produtos
values
('1', 'Camiseta', '29.99', '100');


INSERT into Tbl_Produtos
values
('2', 'Shorts', '19.99', '120'),
('3', 'Bone', '09.99', '115'),
('4', 'Tenis', '59.99', '100'),
('5', 'Blusa', '69.99', '100'),
('6', 'Meias', '06.99', '24'),
('7', 'Canivete', '01.99', '1'),
('8', 'Espada', '71.99', '50'),
('9', 'Arco', '61.99', '40'),
('10', 'Flecha', '01.99', '100'),
('11', 'Alabasda', '69.99', '150');


update Tbl_Produtos
set Preco = '39.99'
where Id = '1'
SELECT * from Tbl_Produtos
*/


/*
CREATE table Tbl_Pedidos (
 Id int, 
 ClienteId int, 
 ProdutoId int, 
 Quantidade int, 
 DataPedido date,
 Constraint FK_Cliente_Id Foreign Key(ClienteId) References Tbl_clientes(Id),
 Constraint FK_Produto_Id Foreign Key(ProdutoId) References Tbl_Produtos(Id),
 Constraint PK_Id Primary Key (Id)
 )
 

 Insert into Tbl_Pedidos
values
('1', '1', '1', '2', '12/03/2024')
 
 Update Tbl_Pedidos
 set Id = '3'
 where Id = '1'

 Insert into Tbl_Pedidos
values
('1', '5', '9', '5', '12/03/2024'),
('2', '10', '6', '7', '12/03/2024'),
('4', '11', '7', '3', '12/03/2024'),
('5', '6', '8', '10', '12/03/2024'),
('6', '7', '7', '20', '12/03/2024'),
('7', '8', '5', '30', '12/03/2024'),
('8', '9', '2', '40', '12/03/2024'),
('9', '4', '4', '50', '12/03/2024'),
('10', '1', '3', '60', '12/03/2024');
 
 Select * from Tbl_Pedidos
 

 Create table Tbl_Funcionarios(
 Id int Primary Key,
 Nome varchar (50),
 Cargo varchar (50),
 Salario decimal,
 )

 Insert into Tbl_Funcionarios
 values
 ('1', 'Maria Santos', 'Gerente', '5000')

 update Tbl_Funcionarios
 set Salario = '6000'
 where Id = '1'

 Insert into Tbl_Funcionarios
 values
 ('2', 'Jorge Santos', 'Zelador', '1500'),
 ('3', 'José Santos', 'Secretario', '2500'),
 ('4', 'Fernando Santos', 'CPO', '5500'),
 ('5', 'Felipe Santos', 'CTO', '5500'),
 ('6', 'Ragnar Santos', 'CEO', '8500'),
 ('7', 'Thor Santos', 'Segurança', '3500'),
 ('8', 'Napoleão Santos', 'Vendedor', '2500'),
 ('9', 'Zezinho Santos', 'Vendedor', '2500'),
 ('10', 'Fulano Santos', 'Vendedor', '2500');
 
 

Create table Tbl_Vendas(
Id int Primary Key,
ProdutoId int, 
Quantidade int, 
ValorTotal decimal(7,2), 
DataVenda date
Constraint FK_ProdutoFunc_Id Foreign Key(ProdutoId) References Tbl_Produtos(Id),
 )
 */
Insert into Tbl_Vendas
 values
 ('1', '2', '2', '79,98', '12/03/2024')

 Insert into Tbl_Vendas
 values
 ('2', '2', '2', '79,98', '12/03/2024'),
 ('3', '10', '10', '80,99', '12/03/2024'),
 ('4', '8', '20', '20,98', '12/03/2024'),
 ('5', '7', '30', '49,98', '12/03/2024'),
 ('6', '9', '8', '25,98', '12/03/2024'),
 ('7', '4', '90', '88,98', '12/03/2024'),
 ('8', '3', '5', '99,98', '12/03/2024'),
 ('9', '6', '5', '10,98', '12/03/2024'),
 ('10', '5', '23', '09,98', '12/03/2024');

/*Delete from Tbl_Vendas
where Id = '1' */

/*Arrumar tabela vendas no campo data*/ 

Select * from Tbl_Vendas

Drop  Tbl_Vendas

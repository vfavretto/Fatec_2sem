select f.primeiro_nome,f.salario,s.nome_setor
from funcionario f
inner join setor s on f.setor_cod = s.COD_SETOR
 
select c.nome_cliente, p.num_pedido
from cliente c
inner join pedido p on c.cod_cliente = p.cod_cliente
 
select c.nome_cliente, p.num_pedido
from cliente c
left outer join pedido p on c.Cod_cliente = p.cod_cliente

select c.nome_cliente, p.num_pedido
from cliente c
left outer join pedido p on c.Cod_cliente = p.cod_cliente
where p.cod_cliente is null

select f.primeiro_nome,f.salario,s.nome_setor
from funcionario f
right outer join Setor s on f.setor_cod = s.cod_setor

Insert into Setor (nome_setor) values ('Marketing')

select f.primeiro_nome,f.salario,s.nome_setor
from funcionario f
right outer join Setor s on f.setor_cod = s.cod_setor
where f.setor_cod is null

select c.nome_cliente, p.num_pedido
from cliente c
Full outer join pedido p on c.Cod_cliente = p.Cod_cliente

select f.primeiro_nome,f.salario,s.nome_setor
from funcionario f
Full outer join Setor s on f.setor_cod = s.cod_setor

select f.primeiro_nome,f.salario,s.nome_setor
from funcionario f
Full outer join Setor s on f.setor_cod = s.cod_setor
where f.setor_cod is null or s.cod_setor is null

select c.nome_cliente, p.num_pedido
from cliente c
Full outer join pedido p on c.Cod_cliente = p.Cod_cliente
where c.Cod_cliente is null or p.cod_cliente is null


select f.primeiro_nome,f.salario,s.nome_setor
from funcionario f
cross join Setor s
Order by f.primeiro_nome


select c.nome_cliente, p.num_pedido
from cliente c
cross join pedido p
Order by c.Nome_cliente

select min(salario_fixo) as 'Menor Salario', max(salario_fixo) as 'Maior Salario'
from vendedor

select sum(quantidade)
from item_pedido 
where cod_produto = 3

select avg(salario_fixo) as Media_Salario
From vendedor

select count (*) from vendedor
where salario_fixo > 2500.00

select num_pedido, total_produtos = count(*)
from item_pedido
group by num_pedido

select num_pedido, total_produtos = count(*)
from item_pedido
where quantidade > 5
group by num_pedido
having count (*) > 1

update produto
set valor_unitario = 4.00
where descricao = 'alface'

update produto
set valor_unitario = valor_unitario * 1.025
where valor_unitario <
	(select avg(valor_unitario)
	from produto
	where unidade = 'KG')

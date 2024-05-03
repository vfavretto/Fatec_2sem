/* 1 */
select * from CLIENTES;

/* 2 */
select * from FILME;

/* 3 */
select * from CATEGORIA;

/* 4 */
select * from CLIENTES
where sexo = 'M' and CIDADE = 'Sorocaba';

/* 5 */
select c.NOME, c.TELEFONE from CLIENTES c
order by NOME;

/* 6 */
select count(*) from CLIENTES
where sexo = 'F';

/* 7 */
select NOME_CATEGORIA from CATEGORIA
order by NOME_CATEGORIA;

/* 8 */
select FILME from FILME
where DIRETOR = 'Shawn Levy' and RESERVADA = 'n';

/* 9 */
select FILME from FILME
where VALOR_LOCACAO > 5 and RESERVADA = 's';

/* 10 */
select DISTINCT DIRETOR from FILME;

/* 11 */
select count(*) from FILME
where RESERVADA = 's';

/* 12 */
select MAX(VALOR_LOCACAO) from FILME;

/* 13 */
select *, cat.COD_CATEGORIA from FILME f
left outer join CATEGORIA cat on cat.COD_CATEGORIA = f.COD_CATEGORIA
where cat.NOME_CATEGORIA = 'Aç?o';

/* 14 */
select *, cat.COD_CATEGORIA from FILME f
left outer join CATEGORIA cat on cat.COD_CATEGORIA = f.COD_CATEGORIA
where (cat.NOME_CATEGORIA = 'Romance' or cat.NOME_CATEGORIA = 'Aventura')
AND f.RESERVADA = 's' AND VALOR_LOCACAO < 5;

/* 15 */
select f.FILME, c.NOME from CLIENTES c
full join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
full join FILME f on f.COD_FILME = l.COD_FILME
where c.NOME = 'Renata Cristina';

/* 16 */
select c.COD_CLIENTE, c.NOME, count(l.COD_LOCACAO) as Total_Locacoes from CLIENTES c
full join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
group by c.COD_CLIENTE, c.NOME
having count(l.COD_LOCACAO) > 3

/* 17 */
select c.NOME, sum(all f.VALOR_LOCACAO) as Total_Gasto from CLIENTES c
full join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
full join FILME f on f.COD_FILME = l.COD_FILME
where c.NOME = 'Renata Cristina'
group by c.NOME;

/* 18 */
select ROUND(avg(VALOR_LOCACAO), 2) as MEDIA_LOCACAO
from FILME;

/* 19 */
select min(VALOR_LOCACAO) as MIN_LOCACAO
from FILME;

/* 20 */
select c.NOME_CATEGORIA, count(f.COD_FILME) as Qtd_filme 
from CATEGORIA C
join FILME f on c.COD_CATEGORIA = f.COD_CATEGORIA
Group by c.NOME_CATEGORIA
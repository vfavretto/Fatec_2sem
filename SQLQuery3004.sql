
Select NomeCategoria from Categoria
where CategoriaID in (Select CategoriaID from Produto where Preco > 1000)
union
Select NomeCategoria from Categoria
where CategoriaID in (Select Produto.CategoriaID from Produto join Pedido on Produto.ProdutoID = Pedido.ProdutoID)

select NomeProduto
from Produto
where Preco < 100
union all
select NomeProduto
from Produto
where Preco > 1000;

select NomeCategoria
from Categoria
where CategoriaID in (select CategoriaID from Produto where Preco > 1000)
intersect
select NomeCategoria
from Categoria
where CategoriaID in (select Produto.CategoriaID from Produto join Pedido on Produto.ProdutoID = Pedido.ProdutoID);

select NomeCategoria
from Categoria
where CategoriaID in (select CategoriaID from Produto where Preco > 100)
except
select NomeCategoria
from Categoria
where CategoriaID in (select Produto.CategoriaID from Produto join Pedido on Produto.ProdutoID = Pedido.ProdutoID);


create view ProdutosCaros AS
select NomeProduto, Preco
from Produto
where Preco > 1000

select * from ProdutosCaros	

alter view ProdutosCaros as
select CategoriaID
from Produto

create view ProdutoMaisCarosPorCategoria as
select Categoria.NomeCategoria, Produto.NomeProduto, Produto.Preco
from Categoria
inner join Produto on Categoria.CategoriaID = Produto.CategoriaID
where Produto.Preco = ( Select Max(Preco) from Produto as P 
						where P.CategoriaID = Categoria.CategoriaID )

select * from ProdutoMaisCarosPorCategoria


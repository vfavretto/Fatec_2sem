select NomeProduto FROM Produto
where Preco > ALL (select Preco FROM Produto Where NomeProduto = 'Chapéu')

select NomeProduto from Produto
where Preco > ALL (select Preco from Produto
where CategoriaID =
(select CategoriaID from Categoria where NomeCategoria = 'Eletônicos'));


select NomeProduto from Produto
where Preco < ANY (Select Preco from Produto where CategoriaID = 1);

select NomeProduto
from Produto
where exists (Select * from Pedido where Pedido.ProdutoID = Produto.ProdutoID);

select NomeProduto
from Produto
where ProdutoID in (Select ProdutoID from Pedido where PedidoID in (1, 3));

select NomeProduto 
from Produto
wher
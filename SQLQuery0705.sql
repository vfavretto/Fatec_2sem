/* Variáveis */

declare @Minpreco Decimal (10,2); -- Declaração de Variável
set  @Minpreco = 50; -- Definição do valor da variável
--Consulta usando a variável
Select NomeProduto, Preco
From Produto
where Preco >= @Minpreco;


Declare @TotalPedidos INT; --Declaração da variável
-- Definição do valor da variável usando SELECT
Select @TotalPedidos = COUNT(*)
From Pedido;

--Exibindo o valor da variável
Print 'O valor de pedidos é: ' + Cast(@TotalPedidos AS NVARCHAR(10));


declare @MediaPreco Decimal (10,2); -- Declaração de Variável
set  @MediaPreco = (
	Select AVG(Preco)
	From Produto
	where CategoriaID = 1); -- Definição do valor da variável
-- Exibindo o valor da variável
Print 'A media de preço na categoria de Eletrônicos é: ' + Cast (@MediaPreco AS NVARCHAR(10));


declare @ProdutoMaisCaro NVARCHAR(50);
select top 1 @ProdutoMaisCaro = NomeProduto
from Produto
Order by Preco desc;
Print 'O Produto mais caro é: ' + @ProdutoMaisCaro;


Select top 10 NomeProduto, Preco
from Produto
Order by Preco desc;



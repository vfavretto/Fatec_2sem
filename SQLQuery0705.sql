/* Vari�veis */

declare @Minpreco Decimal (10,2); -- Declara��o de Vari�vel
set  @Minpreco = 50; -- Defini��o do valor da vari�vel
--Consulta usando a vari�vel
Select NomeProduto, Preco
From Produto
where Preco >= @Minpreco;


Declare @TotalPedidos INT; --Declara��o da vari�vel
-- Defini��o do valor da vari�vel usando SELECT
Select @TotalPedidos = COUNT(*)
From Pedido;

--Exibindo o valor da vari�vel
Print 'O valor de pedidos �: ' + Cast(@TotalPedidos AS NVARCHAR(10));


declare @MediaPreco Decimal (10,2); -- Declara��o de Vari�vel
set  @MediaPreco = (
	Select AVG(Preco)
	From Produto
	where CategoriaID = 1); -- Defini��o do valor da vari�vel
-- Exibindo o valor da vari�vel
Print 'A media de pre�o na categoria de Eletr�nicos �: ' + Cast (@MediaPreco AS NVARCHAR(10));


declare @ProdutoMaisCaro NVARCHAR(50);
select top 1 @ProdutoMaisCaro = NomeProduto
from Produto
Order by Preco desc;
Print 'O Produto mais caro �: ' + @ProdutoMaisCaro;


Select top 10 NomeProduto, Preco
from Produto
Order by Preco desc;



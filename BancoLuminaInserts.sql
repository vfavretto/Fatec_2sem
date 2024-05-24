-- Tabela Empresa

insert into Empresa values ('35382746818',
'22333333444422',
'Lumina LTDA',
'Victor Favretto',
'luminaltda@lumina.com.br',
'favretto@lumina.com.br',
'1199339973',
'15998339573',
null,
'lumina.com.br',
'linkedin.com/lumina',
'instagram.com/lumina',
'facebook.com/lumina',
'Rua fatec de votorantim',
'SP',
'Votorantim',
'Brasil',
'coxinha123',
'Uma empresa muito legal, que busca parceiros para mudar o mundo atraves da sustentabilidade',
null,
null)

insert into Empresa values ('12345678900',
'99333333444455',
'Julinha Jardinagens',
'Julia Fernanda',
'JuJardins@lumina.com.br',
'julinha@lumina.com.br',
'15983388736',
'15998339573',
null,
'jujardins.com.br',
'linkedin.com/julinha',
'instagram.com/julinha',
'facebook.com/julinha',
'Rua dos bobos numero 0',
'SP',
'Votorantim',
'Brasil',
'unicornios',
'THIS IS JARDINAGEM',
null,
null)


/* Servicos */

insert into Servicos values
('Jardinagem'), ('Reciclagem'), ('Coleta Seletiva'),
('Paineis Solares'), ('Documentação Eletrônica')


-- Mensagem

insert into Mensagem values
(1, 2, GETDATE() , 'Olá Gostaríamos de entrar em contato para fechar negócios'),
(2, 1, GETDATE() , 'Olá fico feliz em receber sua  mensagem, vamos marcar uma reunião para discutirmos mais detalhes'),
(2, 1, GETDATE() , 'Outra mensagem para teste')



-- Procura_Oferece

insert into Procura_Oferece values
(null, 2 )

-- Administrador
insert into Administrador values
('AnaSuportes', 'ablubledasideais')

-- Selects

select REPLACE (nomeEmpresa, 'A', 'Z') from Empresa

select LOWER (nomeResp) from Empresa

select LEN ('Olá Gostaríamos de entrar em contato para fechar negócios')

select distinct nomeEmpresa, UF from Empresa
where UF = 'SP';

select nomeResp, nomeEmpresa from Empresa
order by nomeResp;


select e.idEmpresa, count(Mensagem.idEmpresaEnvia) as msgEnviada
from Empresa e
inner join Mensagem  on e.idEmpresa = Mensagem.idEmpresaEnvia
group by e.idEmpresa;

select nomeEmpresa from Empresa e
where Exists (select * from Mensagem m
				where e.idEmpresa = m.idEmpresaRecebe) 

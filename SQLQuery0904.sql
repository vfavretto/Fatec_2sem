/* Função data e hora */

DATENAME (datepart, date)

select DATENAME (yy, getdate())

DATEPART (datepart, date)

select DATEPART (mm, GETDATE())
select DATEPART (MONTH,GETDATE())


DAY (date)

select DAY(GETDATE())

MONTH (date)

select MONTH(GETDATE())

YEAR (date)

select YEAR (GETDATE())


DATEDIFF (datepart, startdate, enddate)

select DATEDIFF (YY, GETDATE(), getdate()+366)
select DATEDIFF (WEEK, GETDATE(), getdate()+720)

DATEADD (datepart, number, date)

select DATEADD (yy, 1, getdate())

select DATENAME (MONTH,(Dateadd(month,3,getdate())))

ISDATE ( EXPRESSION )

select isdate ('27-02-27')
select ISDATE ('30-02-2023')


CONVERT ( expression )

select CONVERT (char, GETDATE(), 103)

select CONVERT (char, GETDATE(), 113)

ROUND (numeric_expression, lenght)

select ROUND (123.2467, 3)



POWER (m, expoente)

select POWER (4,2)
select POWER (2,2)

replace (cad, cadeia_busca [, cadeia_substituicao])

select REPLACE ('abcdefghicde', 'cde', 'xxx')
select REPLACE (PRIMEIRO_NOME, 'A', 'Z') from Funcionario

select STUFF ('abcdef',2,3,'_ijklmn_')


select LEFT ('abcdefgh', 5)

select RIGHT ('abcdefgh', 5)

select REPLICATE ('ABC', 3)

select SUBSTRING ('ABCDEFGHIJ', 2, 3)

select LEN ('ABCDE')
select LEN ('ABCDE  ')

SELECT REVERSE ('ABCD')

select LOWER ('AbCD')
select LOWER (Primeiro_nome) from Funcionario

select upper ('AbCD')
select upper (Primeiro_nome) from Funcionario

select '_' + LTRIM ('   AbCD   ') + '_'

select '_' + RTRIM ('   AbCD   ') + '_'
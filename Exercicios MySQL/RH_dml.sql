INSERT INTO mydb.tb_rh(nome,cpf,email,endereco,salario)
VALUES
("Marcelo Souza", "123.456.789-10", "markandy128@gmail.com", "Beco do Flash", 2.600),
("Anderson Conforto", "123.456.789-22", "andersonf22@gamil.com", "Beco do Hulk", 2.500),
("Jéssica Cordeiro", "123.456.789-26", "jessica.cd@gmail.com", "Beco do Batman", 2.700),
("Guilherme Domingues", "123.456.789-24", "guilherme.dg@gmail.com", "Beco do Capitão América", 2.600),
("Vinicius Menezes","123.456.789-25", "viniciusmz@gmail.com", "Beco do Homem de Ferro", 2.800);
SELECT salario,nome
FROM mydb.tb_rh
WHERE salario > 2.000;


SELECT salario,nome
FROM mydb.tb_rh
WHERE salario < 2.000;

UPDATE mydb.tb_rh
SET salario = 1.900
WHERE idRH = 1;
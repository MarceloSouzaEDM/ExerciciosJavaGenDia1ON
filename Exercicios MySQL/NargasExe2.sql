INSERT INTO mydb.tb_ecommerce(nome,preco,quantidade,cor)
VALUES
("Alali Dragon", 220, 10, "Preto"),
("Mani Sultan", 600, 4, "Azul"),
("Triton Zip", 270, 6, "Dourado"),
("Amazon Prime", 290, 3, "Madeira Escura, Corpo Preto"),
("Zeus V2", 260, 3, "Vermelho");

SELECT preco,nome
FROM mydb.tb_ecommerce
WHERE preco > 500;


SELECT preco,nome
FROM mydb.tb_ecommerce
WHERE preco < 500;

UPDATE mydb.tb_ecommerce
SET preco = 600
WHERE idTB_Ecommerce = 5;
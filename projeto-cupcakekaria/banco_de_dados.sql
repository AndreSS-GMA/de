DROP DATABASE IF EXISTS pit_cupcake;
CREATE DATABASE pit_cupcake;
USE pit_cupcake;

CREATE TABLE cupcake (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255),
    preco DECIMAL(10,2) NOT NULL,
    foto_url VARCHAR(500)
);

INSERT INTO cupcake (nome, descricao, preco, foto_url) VALUES 
('Morango', 'Massa fofinha com cobertura cremosa', 11.00, 'https://i.postimg.cc/9Xn0TB6P/Cupcakede-Morango-jpg.jpg'),
('Chocolate', 'Massa de cacau com brigadeiro', 10.00, 'https://i.postimg.cc/SR2yVwB3/Cupcakede-Chocolate-jpg.jpg'),
('Baunilha', 'Massa clássica com creme de manteiga', 9.50, 'https://i.postimg.cc/1zvsSmP6/Cupcakede-Baunilha-jpg.jpg');

SELECT * FROM cupcake;
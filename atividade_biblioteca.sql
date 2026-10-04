USE atividade_biblioteca;

SELECT * FROM Usuario;


-- 1. Criação da base de dados
DROP DATABASE IF EXISTS atividade_biblioteca;
CREATE DATABASE atividade_biblioteca;
USE atividade_biblioteca;

-- 2. Criação das tabelas
CREATE TABLE Usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Livro (
    id_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id_usuario)
);

-- 3. Inserção de dados
INSERT INTO Usuario (nome, email) VALUES
('Maria Souza', 'maria@email.com'),
('João Silva', 'joao@email.com'),
('Ana Costa', 'ana@email.com'),
('Pedro Lima', 'pedro@email.com'),
('Carla Mendes', 'carla@email.com');

INSERT INTO Livro (titulo, autor, preco, usuario_id) VALUES
('Dom Casmurro', 'Machado de Assis', 39.90, 1),
('Memórias Póstumas de Brás Cubas', 'Machado de Assis', 29.90, 2),
('O Cortiço', 'Aluísio Azevedo', 25.00, 3),
('Iracema', 'José de Alencar', 19.90, 4),
('Capitães da Areia', 'Jorge Amado', 34.50, 5);

-- 4. Exibição dos dados
SELECT * FROM Usuario;
SELECT * FROM Livro;
SELECT * FROM Usuario WHERE nome = 'Maria Souza';
SELECT * FROM Livro WHERE autor = 'Machado de Assis';

-- 5. Edição dos dados
UPDATE Usuario SET email = 'maria.souza@email.com' WHERE id_usuario = 1;
UPDATE Livro SET preco = 44.90 WHERE id_livro = 1;

-- 6. Exclusão dos dados
DELETE FROM Usuario WHERE id_usuario = 5;
DELETE FROM Livro WHERE id_livro = 5;

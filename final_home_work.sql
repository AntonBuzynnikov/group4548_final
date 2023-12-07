-- Создание и заполнение низкоуровневых таблиц
CREATE TABLE IF NOT EXISTS dog
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT
);
CREATE TABLE IF NOT EXISTS cat
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT
);
CREATE TABLE IF NOT EXISTS hamster
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT
);
CREATE TABLE IF NOT EXISTS horse
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT
);
CREATE TABLE IF NOT EXISTS donkey
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT
);
CREATE TABLE IF NOT EXISTS camel
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT
);
CREATE TABLE IF NOT EXISTS breed_animal
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(45) NOT NULL
);
INSERT INTO breed_animal (name) VALUES
	('Немецкая овчарка'),
	('Персидская'),
	('Джунгарик'),
	('Донская'),
	('Пуату'),
	('Дромедар');
INSERT INTO dog (name,birthday,breed,commands,type_animal)
VALUES
	('Зевс','2022-11-11',1,'Сидеть, Лежать','Собака');
INSERT INTO cat (name,birthday,breed,commands,type_animal)
VALUES
	('Барсик','2021-10-10',2,'Дай лапу','Кошка');
INSERT INTO hamster (name,birthday,breed,commands,type_animal)
VALUES
	('Кеша','2023-05-05',3,'Кушать','Хомяк');
INSERT INTO horse (name,birthday,breed,commands,type_animal)
VALUES
	('Квадрат','2022-11-11',4,'Голоп,Рысь','Лошадь');
INSERT INTO donkey (name,birthday,breed,commands,type_animal)
VALUES
	('ИА','2021-11-11',5,'Тяни','Осёл');
INSERT INTO camel (name,birthday,breed,commands,type_animal)
VALUES
	('Мустафа','2023-05-05',6,'Лежать','Верблюд');

-- Удаление верблюдов
DROP TABLE camel;

-- Объединение ослов и лошадей
CREATE TABLE IF NOT EXISTS horse_donkey AS
	SELECT name,birthday,breed,commands
	FROM horse;
INSERT INTO horse_donkey (name,birthday,breed,commands)
SELECT name,birthday,breed,commands FROM donkey;


-- Общая таблица
CREATE TABLE IF NOT EXISTS animal
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT,
	type_animal VARCHAR(20)
);	
INSERT INTO animal (name,birthday,breed,commands,type_animals)
SELECT name,birthday,breed,commands,type_animal
FROM dog
UNION
SELECT name,birthday,breed,commands,type_animal
FROM cat 
UNION
SELECT name,birthday,breed,commands,type_animal
FROM hamster 
UNION
SELECT name,birthday,breed,commands,type_animal
FROM horse
UNION
SELECT name,birthday,breed,commands,type_animal
FROM donkey;

-- Молодые животные
CREATE TABLE IF NOT EXISTS little_animal
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	birthday DATE,
	breed INT,
	commands TEXT,
	age INT
);
INSERT INTO little_animal (name,birthday,breed,commands,age)
SELECT name,birthday,breed,commands, TIMESTAMPDIFF(MONTH,birthday,CURDATE()) as age
FROM dog
WHERE TIMESTAMPDIFF(MONTH,birthday,CURDATE()) BETWEEN 12 AND 36 
UNION
SELECT name,birthday,breed,commands,TIMESTAMPDIFF(MONTH,birthday,CURDATE()) as age
FROM cat
WHERE TIMESTAMPDIFF(MONTH,birthday,CURDATE()) BETWEEN 12 AND 36 
UNION
SELECT name,birthday,breed,commands,TIMESTAMPDIFF(MONTH,birthday,CURDATE()) as age
FROM hamster
WHERE TIMESTAMPDIFF(MONTH,birthday,CURDATE()) BETWEEN 12 AND 36 
UNION
SELECT name,birthday,breed,commands,TIMESTAMPDIFF(MONTH,birthday,CURDATE()) as age 
FROM horse
WHERE TIMESTAMPDIFF(MONTH,birthday,CURDATE()) BETWEEN 12 AND 36 
UNION
SELECT name,birthday,breed,commands,TIMESTAMPDIFF(MONTH,birthday,CURDATE()) as age
FROM donkey
WHERE TIMESTAMPDIFF(MONTH,birthday,CURDATE()) BETWEEN 12 AND 36 ;

SELECT CURDATE() ;
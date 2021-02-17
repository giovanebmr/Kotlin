CREATE TABLE "carros" (
	"id"	INTEGER NOT NULL,
	"placa"	TEXT NOT NULL,
	"marca"	TEXT NOT NULL,
	"modelo"	TEXT NOT NULL,
	"cor"	TEXT NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
)



INSERT INTO carros (placa,marca,modelo,cor) VALUES ('ABC1234','FIAT','BRAVO','PRETA' )

--SELECT * FROM carros
--SELECT placa FROM carros
--SELECT * FROM carros WHERE placa = 'ABC1234'
--SELECT * FROM carros WHERE placa like "AB%"
--SELECT * FROM carros WHERE cor like "%TA"
--SELECT * FROM carros WHERE marca = 'FIAT'
--SELECT * FROM carros WHERE marca = 'FIAT' AND cor = 'PRETA'


--DELETE FROM carros WHERE placa = "ABC1234"
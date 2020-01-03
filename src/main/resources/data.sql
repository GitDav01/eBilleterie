
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD)
VALUES(999L,'LUDOVIC','LOUIS','INTERNAL','ludo@gmail.com','0671878998',6, 'rue docteur Strauss', 98500,'ORION','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD)
VALUES(998L,'CRISTINA','ADOLPHE','INTERNAL','christina@gmail.com','0671878794',8, 'rue luper noulle', 98500,'Hawai','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD)
VALUES(997L,'GENEVIEVE','CARLOTTA','EXTERNAL','genevieve@gmail.com','067187256',45, 'rue sebastien tradime', 98500,'Chez_elle','password');

INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES(2000L,'GENE_Ludo_1','CARLOTTINE','genev@gmail.com','0671872457',999L);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES(3000L,'MORILLE_Ludo_1','LUDOVIC','MORILLE@gmail.com','0674552457',999L);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES(4000L,'GENE_Chritina_2','CARLOTTINE','genev@gmail.com','0671872457',998L);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES(5000L,'MORILLE_Chritina_2','LUDOVIC','MORILLE@gmail.com','0674552457',998L);


INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (3L, 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €',false,'06122020','/assets/imageUGC','UGC');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (4L,'CINEMA', 'LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','https://cineCHEQUE','CINECHEQUE');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (5L, 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS »','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € '
,false,'06122020','https://Gaumont Pathe','PATHE GAUMONT');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (6L, 'LOISIRS','ZOO DE BEAUVAL','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'Tarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','https://Jardin Zoo de beauval','ZOO DE BEAUVAL');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (7L, 'LOISIRS','JARDIN D ACCLIMATATION','Du nouveau au Jardin d Acclimatation Plongez dans la première réserve virtuelle avec la nouvelle attraction du Jardin '
,'Tarif unique - de 3 ans : entrée est gratuite (mais pas les manèges),INTERNE 15 € • CLIENT 21 € • '
,false,'06122020','https://Jardin accimatation','JARDIN D ACCLIMATATION ');


INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(2L,'CARTE UGC SOLO',51.5,200,'INTERNAL_UNIQUE_PRICE',3L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(3L,'CARTE UGC SOLO',68,200,'EXTERNAL_UNIQUE_PRICE',3L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(4L,'LA CONTREMARQUE CINÉCHÈQUE',51.5,200,'INTERNAL_UNIQUE_PRICE',4L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(5L,'LA CONTREMARQUE CINÉCHÈQUE',68,200,'EXTERNAL_UNIQUE_PRICE',4L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(6L,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',64,200,'INTERNAL_UNIQUE_PRICE',5L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(7L,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',85,200,'EXTERNAL_UNIQUE_PRICE',5L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(8L,'ZOO DE BEAUVAL',12,200,'INTERNAL_CHILD_PRICE',6L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(9L,'ZOO DE BEAUVAL',18,100,'EXTERNAL_CHILD_PRICE',6L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(10L,'ZOO DE BEAUVAL',17,200,'INTERNAL_ADULT_PRICE',6L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(11L,'JARDIN D ACCLIMATATION',23,100,'EXTERNAL_ADULT_PRICE',6L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(12L,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',15,315,'INTERNAL_UNIQUE_PRICE',7L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(13L,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',21,415,'EXTERNAL_UNIQUE_PRICE',7L);

INSERT INTO BASKET  (ID,quantity,status,CUSTOMER_ID,ETICKET_ID)
VALUES (1000L,3,true,999L,4L);
INSERT INTO BASKET  (ID,quantity,status,CUSTOMER_ID,ETICKET_ID)
VALUES (2000L,5,false,999L,5L);
INSERT INTO BASKET  (ID,quantity,status,CUSTOMER_ID,ETICKET_ID)
VALUES (3000L,6,true,998L,5L);
INSERT INTO BASKET  (ID,quantity,status,CUSTOMER_ID,ETICKET_ID)
VALUES (4000L,9,false,998L,7L);

INSERT INTO PROVIDER (id, name, category)
VALUES ('1', 'UGC CINE','CINEMA');
INSERT INTO PROVIDER (id, name, category)
VALUES ('2', 'UGC CINE','CINEMA');

INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('1', 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €'
,false,'06122020','INTERNAL_UNIQUE_PRICE',51.50,200,'/assets/imageUGC','UGC');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('2', 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €'
,false,'06122020','EXTERNAL_UNIQUE_PRICE',68,100,':assets//imageUGC','UGC');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('3','CINEMA', 'LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','INTERNAL_UNIQUE_PRICE',54,300,'https://cineCHEQUE','CINECHEQUE');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('4', 'CINEMA','LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','EXTERNAL_UNIQUE_PRICE',71.50,600,'https://cineCHEQUE','CINECHEQUE');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('5', 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS » ','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € '
,false,'06122020','INTERNAL_UNIQUE_PRICE',64,300,'https://Gaumont Pathe','PATHE GAUMONT');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('6', 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS » ','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € '
,false,'06122020','INTERNAL_UNIQUE_PRICE',85,200,'https://Gaumont Pathe','PATHE GAUMONT');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('7', 'LOISIRS','JARDIN D ACCLIMATATION  ','Du nouveau au Jardin d Acclimatation Plongez dans la première réserve virtuelle avec la nouvelle attraction du Jardin '
,'Tarif unique - de 3 ans : entrée est gratuite (mais pas les manèges),INTERNE 15 € • CLIENT 21 € • '
,false,'06122020','INTERNAL_UNIQUE_PRICE',15,100,'https://Jardin accimatation','JARDIN D ACCLIMATATION ');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('8', 'LOISIRS','JARDIN D ACCLIMATATION  ','Du nouveau au Jardin d Acclimatation Plongez dans la première réserve virtuelle avec la nouvelle attraction du Jardin '
,'Tarif unique - de 3 ans : entrée est gratuite (mais pas les manèges),INTERNE 15 € • CLIENT 21 € • '
,false,'06122020','EXTERNAL_UNIQUE_PRICE',21,200,'https://Jardin accimatation','JARDIN D ACCLIMATATION ');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('9  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','INTERNAL_CHILD_PRICE',12,100,'https://Jardin Zoo de beauval','ZOO DE BEAUVAL');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('10  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','EXTERNAL_CHILD_PRICE',18,100,'https://Jardin Zoo de beauval','ZOO DE BEAUVAL');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('11  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','INTERNAL_CHILD_PRICE',17,100,'https://Jardin Zoo de beauval','ZOO DE BEAUVAL');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('12  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','EXTERNAL_CHILD_PRICE',23,400,'https://Jardin Zoo de beauval','ZOO DE BEAUVAL');
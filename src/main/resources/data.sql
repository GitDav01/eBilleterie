INSERT INTO PROVIDER (id, name, category)
VALUES ('1', 'UGC CINE','CINEMA');
INSERT INTO PROVIDER (id, name, category)
VALUES ('2', 'UGC CINE','CINEMA');

INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('1', 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €'
,false,'06122020','INTERNAL_UNIQUE_PRICE',51.50,200,'assets/ugc240x318.png','UGC');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('2', 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €'
,false,'06122020','EXTERNAL_UNIQUE_PRICE',68,100,'assets/ugc240x318.png','UGC');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('3','CINEMA', 'LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','INTERNAL_UNIQUE_PRICE',54,300,'assets/cinecheque240x318.png','CINECHEQUE');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('4', 'CINEMA','LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','EXTERNAL_UNIQUE_PRICE',71.50,600,'assets/cinecheque240x318.png','CINECHEQUE');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('5', 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS » ','10 Cartes Ciné Accès - La carte Ciné Accès permet d’obtenir une place de cinéma valable tous les jours, à toutes les séances, dans toutes les salles Gaumont et Pathé* en France, ainsi que dans les cinémas affiliés, dans la limite de la date de validité et des restrictions éventuelles mentionnées au verso de la carte.Vous bénéficiez en plus d’une carte de fidélité Gaumont et Pathé disponible dans les salles de cinéma à activer sur www.cinemasgaumontpathe.com pour profiter des différentes offres.'
,'tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € '
,false,'06122020','INTERNAL_UNIQUE_PRICE',64,300,'assets/gaumont240x318.png','PATHE GAUMONT');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('6', 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS » ','10 Cartes Ciné Accès - La carte Ciné Accès permet d’obtenir une place de cinéma valable tous les jours, à toutes les séances, dans toutes les salles Gaumont et Pathé* en France, ainsi que dans les cinémas affiliés, dans la limite de la date de validité et des restrictions éventuelles mentionnées au verso de la carte.Vous bénéficiez en plus d’une carte de fidélité Gaumont et Pathé disponible dans les salles de cinéma à activer sur www.cinemasgaumontpathe.com pour profiter des différentes offres.'
,'tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € '
,false,'06122020','INTERNAL_UNIQUE_PRICE',85,200,'assets/gaumont240x318.png','PATHE GAUMONT');
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
,false,'06122020','INTERNAL_CHILD_PRICE',12,100,'assets/zooBeauval240x318.png','ZOO DE BEAUVAL');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('10  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','EXTERNAL_CHILD_PRICE',18,100,'assets/zooBeauval240x318.png','ZOO DE BEAUVAL');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('11  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','INTERNAL_CHILD_PRICE',17,100,'assets/zooBeauval240x318.png','ZOO DE BEAUVAL');
INSERT INTO ETICKET (id, category,reference, description,law,nominative,VALIDITY_DATE,type_Price,price,stock,image,provider)
VALUES ('12  ', 'LOISIRS','ZOO DE BEAUVAL  ','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'TTarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','EXTERNAL_CHILD_PRICE',23,400,'assets/zooBeauval240x318.png','ZOO DE BEAUVAL');


INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD)
VALUES('1','LUDOVIC','LOUIS','INTERNAL','ludo@gmail.com','0671878998',6, 'rue docteur Strauss', 98500,'ORION','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD)
VALUES('2','CRISTINA','ADOLPHE','INTERNAL','christina@gmail.com','0671878794',8, 'rue luper noulle', 98500,'Hawai','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD)
VALUES('3','GENEVIEVE','CARLOTTA','EXTERNAL','genevieve@gmail.com','067187256',45, 'rue sebastien tradime', 98500,'Chez_elle','password');

INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES('1','GENE_Ludo_1','CARLOTTINE','genev@gmail.com','0671872457','1');
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES('2','MORILLE_Ludo_1','LUDOVIC','MORILLE@gmail.com','0674552457','1');
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES('3','GENE_Chritina_2','CARLOTTINE','genev@gmail.com','0671872457','2');
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID)
VALUES('4','MORILLE_Chritina_2','LUDOVIC','MORILLE@gmail.com','0674552457','2');


INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES ('1', 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €',false,'06122020','assets/ugc240x318.png','UGC');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES ('2','CINEMA', 'LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','assets/cinecheque240x318.png','CINECHEQUE');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES ('3', 'LOISIRS','ZOO DE BEAUVAL','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'Tarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','assets/zooBeauval240x318.png','ZOO DE BEAUVAL');


INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('1','CARTE UGC SOLO',51.5,200,'INTERNAL_UNIQUE_PRICE','1');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('2','CARTE UGC SOLO',68,200,'EXTERNAL_UNIQUE_PRICE','1');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('3','LA CONTREMARQUE CINÉCHÈQUE',54,200,'INTERNAL_UNIQUE_PRICE','2');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('4','LA CONTREMARQUE CINÉCHÈQUE',71.5,500,'EXTERNAL_UNIQUE_PRICE','2');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('5','ZOO DE BEAUVAL',12,700,'INTERNAL_CHILD_PRICE','3');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('6','ZOO DE BEAUVAL',18,300,'EXTERNAL_CHILD_PRICE','3');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('7','ZOO DE BEAUVAL',17,200,'INTERNAL_ADULT_PRICE','3');
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES('8','ZOO DE BEAUVAL',23,100,'EXTERNAL_ADULT_PRICE','3');



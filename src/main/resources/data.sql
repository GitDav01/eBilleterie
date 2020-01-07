
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
,'tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €',false,'06122020','assets/ugc240x318.png','UGC');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (4L,'CINEMA', 'LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € '
,false,'06122020','assets/cinecheque240x318.png','CINECHEQUE');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (5L, 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS »','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances'
,'tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € '
,false,'06122020','assets/gaumont240x318.png','PATHE GAUMONT');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (6L, 'LOISIRS','ZOO DE BEAUVAL','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 '
,'Tarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  '
,false,'06122020','assets/zooBeauval240x318.png','ZOO DE BEAUVAL');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (7L, 'LOISIRS','JARDIN D ACCLIMATATION','Du nouveau au Jardin d Acclimatation Plongez dans la première réserve virtuelle avec la nouvelle attraction du Jardin '
,'Tarif unique - de 3 ans : entrée est gratuite (mais pas les manèges),INTERNE 15 € • CLIENT 21 € • '
,false,'06122020','assets/jardinDaclimatation.jpg','JARDIN D ACCLIMATATION ');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (8L, 'LOISIRS','THOIRY','Le parc vous accueille en famille pour un parcours de la réserve à bord de votre véhicule avant de vous convier, à pied, dans le tunnel de verre aux lions et aux tigres ainsi que dans le vivarium. '
,'Tarif enfant (3 à 11 ans inclus) CSEEPF 19 € • extérieur 20 € • public 23 € Tarif adulte (12 ans et plus) CSEEPF 19 € • extérieur 20 € • public 23  '
,false,'06122020','assets/thoiry240x318.png','THOIRY');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider)
VALUES (9L, 'LOISIRS','PARC ASTERIX','Vivez une expérience typiquement gauloise. Un détonnant mélange de 40 attractions et de 5 grands spectacles mis en scène dans 6 univers. Nouveauté 2019 : Attention Menhir, la nouvelle attraction 4D du Parc Astérix ! Pour la première fois, vivez une aventure exclusive d Astérix et Obélix : un film en 4 dimensions avec des effets spéciaux spectaculaires dans une nouvelle salle équipée de 300 fauteuils dernière technologie. Les visiteurs vont vivre et ressentir toutes les péripéties et surprises d une aventure pleine d humour inspirée de l univers de René Goscinny et Albert Uderzo. '
,'Billetterie également utilisable pour la saison Noël (nouveauté 2019) du 21 décembre au 5 janvier 2020. http://www.parcasterix.fr Tarif unique (3 ans et plus) CSEEPF 23 € • extérieur 34 € • public 51 € '
,false,'06122020','assets/parcasterix240x318.png','PARC ASTERIX');


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
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(14L,'THOIRY',20,100,'EXTERNAL_UNIQUE_PRICE',8L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(15L,'THOIRY',19,100,'INTERNAL_UNIQUE_PRICE',8L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(16L,'PARC ASTERIX',23,100,'INTERNAL_UNIQUE_PRICE',9L);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id)
VALUES(17L,'PARC ASTERIX',34,100,'EXTERNAL_UNIQUE_PRICE',9L);

INSERT INTO BASKET2  (ID,quantity,status,category,reference,price,TYPE_PRICE,PURCHASE_DATE,CUSTOMER_ID)
VALUES (1000L,3,true,'CINEMA','CARTE UGC SOLO',61.5,'INTERNAL_ADULT_PRICE','1980-12-12',999L);

INSERT INTO BASKET  (ID,quantity,status,ETICKET_ID)
VALUES (1000L,3,true,4L);
INSERT INTO BASKET  (ID,quantity,status,ETICKET_ID)
VALUES (2000L,5,false,5L);
INSERT INTO BASKET  (ID,quantity,status,ETICKET_ID)
VALUES (3000L,6,true,5L);
INSERT INTO BASKET  (ID,quantity,status,ETICKET_ID)
VALUES (4000L,9,false,7L);

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
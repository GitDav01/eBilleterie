INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (3, 'CINEMA','CARTE UGC SOLO','La carte UGC solo permet d obtenir une place de cinema valable tous les jours, a toutes les seances','tarif UGC 10 Cartes UGC Solo (1 lot par trimestre civil) PRIX INTERNE 51,50 € • CLIENT 68 €',false,'06122020','assets/ugc240x318.png','UGC');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (4,'CINEMA', 'LA CONTREMARQUE CINÉCHÈQUE','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances','tarif CinéChèque 10 contremarques CinéChèque (1 lot par trimestre civil) PRIX INTERNE 54 € • CLIENT 71,50 € ',false,'06122020','assets/cinecheque240x318.png','CINECHEQUE');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (5, 'CINEMA','PATHE GAUMONT LA CARTE « CINÉ ACCÈS »','La  contremarque Cinéchèque  permet d obtenir une place de cinema valable tous les jours, a toutes les seances','tarif Ciné Accès 10 Cartes Ciné Accès (1 lot par trimestre civil) PRIX INTERNE 64 € • CLIENT 85 € ',false,'06122020','assets/gaumont240x318.png','PATHE GAUMONT');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (6, 'LOISIRS','ZOO DE BEAUVAL','Il fait partie des classiques tout en renouvelant chaque année l expérience proposée à ses visiteurs ! Le Zoo Parc de Beauval vous invite à découvrir ses nouveautés 2019 ','Tarif enfant (3 à 10 ans inclus) CSEEPF 12 € • extérieur 18 € • public 23 € Tarif adulte (11 ans et plus) INTERNE 17 € • CLIENT 23 € • public 29  ',false,'06122020','assets/zooBeauval240x318.png','ZOO DE BEAUVAL');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (7, 'LOISIRS','JARDIN D ACCLIMATATION','Du nouveau au Jardin d Acclimatation Plongez dans la première réserve virtuelle avec la nouvelle attraction du Jardin ','Tarif unique - de 3 ans : entrée est gratuite (mais pas les manèges),INTERNE 15 € • CLIENT 21 € • ',false,'06122020','assets/jardinDaclimatation.jpg','JARDIN D ACCLIMATATION ');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (8, 'LOISIRS','THOIRY','Le parc vous accueille en famille pour un parcours de la réserve à bord de votre véhicule avant de vous convier, à pied, dans le tunnel de verre aux lions et aux tigres ainsi que dans le vivarium. ','Tarif enfant (3 à 11 ans inclus) CSEEPF 19 € • extérieur 20 € • public 23 € Tarif adulte (12 ans et plus) CSEEPF 19 € • extérieur 20 € • public 23  ',false,'06122020','assets/thoiry240x318.png','THOIRY');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (9, 'LOISIRS','PARC ASTERIX','Vivez une expérience typiquement gauloise. Un détonnant mélange de 40 attractions et de 5 grands spectacles mis en scène dans 6 univers. Nouveauté 2019 : Attention Menhir, la nouvelle attraction 4D du Parc Astérix ! Pour la première fois, vivez une aventure exclusive d Astérix et Obélix : un film en 4 dimensions avec des effets spéciaux spectaculaires dans une nouvelle salle équipée de 300 fauteuils dernière technologie. Les visiteurs vont vivre et ressentir toutes les péripéties et surprises d une aventure pleine d humour inspirée de l univers de René Goscinny et Albert Uderzo. ','Billetterie également utilisable pour la saison Noël (nouveauté 2019) du 21 décembre au 5 janvier 2020. http://www.parcasterix.fr Tarif unique (3 ans et plus) CSEEPF 23 € • extérieur 34 € • public 51 € ',false,'06122020','assets/parcasterix240x318.png','PARC ASTERIX');
INSERT INTO ETICKET2 (id, category,reference, description,law,nominative,VALIDITY_DATE,image,provider) VALUES (10, 'LOISIRS','PUY DU FOU','Nouveauté 2019 : le Premier Royaume Au Ve siècle, en pleine chute de l Empire Romain tout juste ravagé par les hordes d Attila, accompagnez Clovis, le célèbre roi Franc ! Au fil de ses conquêtes, découvrez les doutes de ce grand stratège partagé entre les traditions ancestrales de son peuple et la voie nouvelle qu il pourrait choisir pour fonder le premier royaume !  ','http://www.puydufou.com Tarif enfant (5 à 13 ans inclus) CSEEPF 18 € • extérieur 24 € • public 30 € Tarif adulte (14 ans et plus) CSEEPF 28 € • extérieur 34 € • public 41 € ',false,'06122020','assets/PuyDuFou.jpg','PUY DU FOU');

INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(2,'CARTE UGC SOLO',51.5,200,'INTERNAL_UNIQUE_PRICE',3);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(3,'CARTE UGC SOLO',68,200,'EXTERNAL_UNIQUE_PRICE',3);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(4,'LA CONTREMARQUE CINÉCHÈQUE',51.5,200,'INTERNAL_UNIQUE_PRICE',4);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(5,'LA CONTREMARQUE CINÉCHÈQUE',68,200,'EXTERNAL_UNIQUE_PRICE',4);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(6,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',64,200,'INTERNAL_UNIQUE_PRICE',5);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(7,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',85,200,'EXTERNAL_UNIQUE_PRICE',5);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(8,'ZOO DE BEAUVAL',12,200,'INTERNAL_CHILD_PRICE',6);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(9,'ZOO DE BEAUVAL',18,100,'EXTERNAL_CHILD_PRICE',6);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(10,'ZOO DE BEAUVAL',17,200,'INTERNAL_ADULT_PRICE',6);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(11,'ZOO DE BEAUVAL',23,100,'EXTERNAL_ADULT_PRICE',6);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(12,'JARDIN D ACCLIMATATION ',15,315,'INTERNAL_UNIQUE_PRICE',7);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(13,'JARDIN D ACCLIMATATION ',21,415,'EXTERNAL_UNIQUE_PRICE',7);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(14,'THOIRY',20,100,'EXTERNAL_UNIQUE_PRICE',8);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(15,'THOIRY',19,100,'INTERNAL_UNIQUE_PRICE',8);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(16,'PARC ASTERIX',23,100,'INTERNAL_UNIQUE_PRICE',9);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(17,'PARC ASTERIX',34,100,'EXTERNAL_UNIQUE_PRICE',9);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(18,'PUY DU FOU',18,200,'INTERNAL_CHILD_PRICE',10);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(19,'PUY DU FOU',24,200,'EXTERNAL_CHILD_PRICE',10);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(20,'PUY DU FOU',28,200,'INTERNAL_ADULT_PRICE',10);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(21,'PUY DU FOU',34,200,'EXTERNAL_ADULT_PRICE',10);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(22,'PUY DU FOU',26,200,'RELATIVE_CHILD_PRICE',10);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(23,'PUY DU FOU',38,200,'RELATIVE_ADULT_PRICE',10);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(222,'CARTE UGC SOLO',72,200,'RELATIVE_UNIQUE_PRICE',3);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(224,'LA CONTREMARQUE CINÉCHÈQUE',75,200,'RELATIVE_UNIQUE_PRICE',4);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(226,'PATHE GAUMONT LA CARTE « CINÉ ACCÈS »',90,200,'RELATIVE_UNIQUE_PRICE',5);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(228,'ZOO DE BEAUVAL',20,200,'RELATIVE_CHILD_PRICE',6);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(210,'ZOO DE BEAUVAL',24,200,'RELATIVE_ADULT_PRICE',6);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(212,'JARDIN D ACCLIMATATION',22,315,'RELATIVE_UNIQUE_PRICE',7);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(215,'THOIRY',22,100,'RELATIVE_UNIQUE_PRICE',8);
INSERT INTO RATE  (ID,name, price, quantity, type_price,eticket_id) VALUES(216,'PARC ASTERIX',36,100,'RELATIVE_UNIQUE_PRICE',9);

INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD) VALUES(999,'LUDOVIC','LOUIS','INTERNAL','ludo@gmail.com','0671878998',6, 'rue docteur Strauss', 98500,'ORION','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD) VALUES(998,'CRISTINA','ADOLPHE','INTERNAL','christina@gmail.com','0671878794',8, 'rue luper noulle', 98500,'Hawai','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD) VALUES(997,'GENEVIEVE','CARLOTTA','EXTERNAL','genevieve@gmail.com','067187256',45, 'rue sebastien tradime', 98500,'Chez_elle','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD) VALUES(996,'COUCOU','INTERNE','INTERNAL','test@test','0671815794',8, 'rue de la pompe', 45500,'Calicultta','password');
INSERT INTO CUSTOMER (ID,NAME,FIRSTNAME,PROFILE,EMAIL,PHONE_NUMBER,ADDRESS_NUMBER,ADDRESS_STREET,ADDRESS_POSTAL_CODE,ADDRESS_CITY,PASSWORD) VALUES(995,'SALOUPE','EXTERNE','EXTERNAL','guru@gmail.com','0671871548',47, 'rue catapultoss', 55555,'nullepart','password');


INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(2000,'GENE_Ludo_1','CARLOTTINE','genev@gmail.com','0671872457',999);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(3000,'MORILLE_Ludo_1','LUDOVIC','MORILLE@gmail.com','0674552457',999);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(4000,'MORILLE_Chritina_2','CARLOTTINE','genev@gmail.com','0671872457',998);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(5000,'MORILLE_Chritina_2','LUDOVIC','MORILLE@gmail.com','0674552457',998);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(6000,'GENE_Chritina_2','SERGE','lulu@gmail.com','0671872457',998);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(7000,'MORILLE_Chritina_2','CATA','dou@gmail.com','0674552457',998);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(8000,'COUCOU_3','LUTRE','124@gmail.com','0671872457',996);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(9000,'COUCOU_3','VOMITO','234@gmail.com','0674552457',996);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(10000,'COUCOU_3','SUPREME','789@gmail.com','0671872457',996);
INSERT INTO RELATIVE (ID,LASTNAME,FIRSTNAME,EMAIL,PHONE_NUMBER,CUSTOMER_ID) VALUES(11000,'COUCOU_3','GOTTA','975@gmail.com','0674552457',996);



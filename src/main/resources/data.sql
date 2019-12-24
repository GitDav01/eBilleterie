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


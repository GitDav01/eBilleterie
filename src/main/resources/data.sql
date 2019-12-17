INSERT INTO PROVIDER (id, name, category)
VALUES ('1', 'UGC CINE','CINEMA');
INSERT INTO PROVIDER (id, name, category)
VALUES ('2', 'GAUMONT','CINEMA');
INSERT INTO PROVIDER (id, name, category)
VALUES ('3', 'PATHE','CINEMA');
INSERT INTO PROVIDER (id, name, category)
VALUES ('4', 'DYSNEYWORLD','PARC_ATTRACTION');
INSERT INTO PROVIDER (id, name, category)
VALUES ('5', 'ASTERIX','PARC_ATTRACTION');

INSERT INTO ETICKET (id, reference, description, law, nominatif, date_validite,
INTERNAL_ADULT_PRICE,EXTERNAL_ADULT_PRICE,INTERNAL_CHILD_PRICE, EXTERNAL_CHILD_PRICE)
VALUES ('1','REF1','description cinema1','regle de distribution',true,'01.05.2018',22,38,15,20);
INSERT INTO ETICKET (id, reference, description, law, nominatif, date_validite,
INTERNAL_ADULT_PRICE,EXTERNAL_ADULT_PRICE,INTERNAL_CHILD_PRICE, EXTERNAL_CHILD_PRICE)
VALUES ('2','REF2','description cinema2','regle de distribution2',false,'01.05.2019',24,32,15,22);

INSERT INTO BASKET  (id,quantity,status)
VALUES ('1',3,true);
INSERT INTO BASKET  (id,quantity,status)
VALUES ('2',5,false);
INSERT INTO BASKET  (id,quantity,status)
VALUES ('3',6,true);
INSERT INTO BASKET  (id,quantity,status)
VALUES ('4',9,false);

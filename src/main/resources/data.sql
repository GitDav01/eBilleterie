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

INSERT INTO ETICKET (id, reference, description, law, nominatif, date_validite,internal_price,external_price)
VALUES ('1','142','description cinema','regle de distribution',true,'01.05.2018',12,18);

INSERT INTO BASKET  (id,quantity,status)
VALUES ('1',3,true);
INSERT INTO BASKET  (id,quantity,status)
VALUES ('2',5,false);
INSERT INTO BASKET  (id,quantity,status)
VALUES ('3',6,true);
INSERT INTO BASKET  (id,quantity,status)
VALUES ('4',9,false);

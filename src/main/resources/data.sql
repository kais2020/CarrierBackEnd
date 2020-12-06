insert into produit values(1,'001','ecran',150);
insert into produit values(2,'002','clavier',16);
insert into produit values(3,'003','souris',10);
insert into client(id,code,nom,adresse,ville,codeTVA) values(1,'001','kais','Tunis ville','Tunis','121212AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(2,'002','Tay','Tunis CENTRE','Tunis','454545AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(3,'003','tass','Tunis BEN AROUS','Tunis','8989898ERT000');
insert into camion(id,code,matricule,marque,client_id) values(1,'001','2145TU120','Renault',1);
insert into camion(id,code,matricule,marque,client_id) values(2,'002','5465TU210','IVECO',2);
insert into client(id,code,nom,adresse,ville,codeTVA) values(4,'004','kais','Tunis ville','Tunis','121212AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(5,'005','Tay','Tunis CENTRE','Tunis','454545AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(6,'006','tass','Tunis BEN AROUS','Tunis','8989898ERT000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(7,'007','kais','Tunis ville','Tunis','121212AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(8,'008','Tay','Tunis CENTRE','Tunis','454545AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(9,'009','tass','Tunis BEN AROUS','Tunis','8989898ERT000');

insert into BL_CLIENT (ID ,DATE_BL ,HT ,NUM ,QTE ,TAXE ,TTC ,TVA ,CAMION_ID ,CLIENT_ID ,PRODUIT_ID )
values (1,current_timestamp,100,'1',20,1,119,19,1,1,1);

insert into utilisateur(id,nom,login,password) values(1,'Admin','admin','1');
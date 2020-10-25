insert into produit values(1,'001','ecran',150);
insert into produit values(2,'002','clavier',16);
insert into produit values(3,'003','souris',10);
insert into client(id,code,nom,adresse,ville,codeTVA) values(1,'001','kais','Tunis ville','Tunis','121212AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(2,'002','Tay','Tunis CENTRE','Tunis','454545AZE000');
insert into client(id,code,nom,adresse,ville,codeTVA) values(3,'003','tass','Tunis BEN AROUS','Tunis','8989898ERT000');
insert into camion(id,code,matricule,marque,client_id) values(1,'001','2145TU120','Renault',1);
insert into camion(id,code,matricule,marque,client_id) values(2,'002','5465TU210','IVECO',2);
insert into utilisateur(id,nom,login,password) values(1,'Admin','admin','admin');
create database ia;
create role ia  login password 'ia';
alter database ia owner to ia;

create table admin(
    id serial primary key not null,
    nom varchar(15),
    mdp varchar(15)
);
insert into admin(nom,mdp) values ('cedi','0000');

create table information(
    id SERIAL PRIMARY key not null,
    titre text,
    body text,
    photo varchar
);

insert into information(titre,body,photo,datePublication) values('IA est trop','on a vue blablablabla','mbola tsis','2023-05-05 15:59:01.425162+03');



/*ALTER TABLE detail ADD datePublication timestamp;
ALTER TABLE detail DROP COLUMN dateCreation;

ALTER TABLE detail ADD dateCreation timestamp default now();


update  detail set statut=0 where id=1;
insert into detail (idType,titre,body,lieu,dateDebut,dateFin,photo) values(2,'ppn','Hausse de prix de ppn','Madagascar','01-02-2023','05-02-3023','ppn.jpg');

create or replace view global as
select type.id as id,detail.id as idDetail,type.type as type,detail.idClient as idclient,client.nom as nomClient,detail.titre as titre,detail.body as body,detail.lieu as lieu,detail.dateDebut as dateDebut,detail.dateFin as dateFin,detail.photo as photo,detail.statut as statut from type join detail on type.id= detail.idType join client on detail.idclient=client.id;

create or replace view total as select count(*) as total from global;*/
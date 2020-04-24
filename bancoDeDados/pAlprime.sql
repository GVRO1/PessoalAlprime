create database pessoalAlprime;
use pessoalAlprime;

create table usuario(id_usuario int primary key auto_increment, nome_usuario varchar(45),cpf_usuario varchar(45),email_usuario varchar(45),senha_usuario varchar(45),telefone varchar(45));
create table maquina (id_maquina int primary key auto_increment,numero_serial varchar(45), tipo_processador varchar(45), capacidade_memoria int, sistema_operacional varchar(45),
						status tinyint, hostname varchar(45), fabricante varchar(45), modelo varchar(45), ram_total varchar(45));
create table localizacao (id_localizacao int primary key auto_increment, nome_localizacao varchar(45), tipo_linha varchar(45), endereco varchar(45), total_maquina int);
create table registro (id_registro int primary key auto_increment, data_hora datetime, porc_processador double, porc_disco double, porc_memoria double,porc_ram double, temp_cpu double);

Alter table maquina add fk_localizacao int;
alter table maquina add foreign key (fk_localizacao)references localizacao(id_localizacao) ;

Alter table registro add fk_maquina int ;
alter table registro add foreign key (fk_maquina) references maquina(id_maquina);

Alter table localizacao add fk_usuario int;
alter table localizacao add foreign key (fk_usuario) references usuario(id_usuario);

select * from maquina;
select * from localizacao;
select * from registro;
select * from usuario;
insert into usuario values (null,"Gabriel","423.529.304-81","gabriel.oliveira@bandtec.com.br","123","964522405");
insert into localizacao values (null,"Giovanni Gronchi","Lilás","Av. João Dias, 3569",1,1);

drop table localizacao;
drop table maquina;
drop table registro;
drop table usuario;
-- INSERT NECESSARIO PARA INSERIR NA PROPOSICAO
insert into tipo_proposicao (id,sigla,nome,descricao) values (1,'AA','NOME TIPOM PROPOSICAO 1','DESCRITION TIPO PROPOSICAO 1');
insert into tipo_proposicao (id,sigla,nome,descricao) values (2,'BBB','NOME TIPOM PROPOSICAO 2','DESCRITION TIPO PROPOSICAO 2');
insert into tipo_proposicao (id,sigla,nome,descricao) values (3,'CCC','NOME TIPOM PROPOSICAO 3','DESCRITION TIPO PROPOSICAO 3');
insert into tipo_proposicao (id,sigla,nome,descricao) values (4,'DDD','NOME TIPOM PROPOSICAO 4','DESCRITION TIPO PROPOSICAO 4');
insert into tipo_proposicao (id,sigla,nome,descricao) values (5,'EEE','NOME TIPOM PROPOSICAO 5','DESCRITION TIPO PROPOSICAO 5');
insert into tipo_proposicao (id,sigla,nome,descricao) values (6,'FFF','NOME TIPOM PROPOSICAO 6','DESCRITION TIPO PROPOSICAO 6');
insert into tipo_proposicao (id,sigla,nome,descricao) values (7,'GGG','NOME TIPOM PROPOSICAO 7','DESCRITION TIPO PROPOSICAO 7');
insert into tipo_proposicao (id,sigla,nome,descricao) values (8,'HHH','NOME TIPOM PROPOSICAO 8','DESCRITION TIPO PROPOSICAO 8');
insert into tipo_proposicao (id,sigla,nome,descricao) values (9,'III','NOME TIPOM PROPOSICAO 9','DESCRITION TIPO PROPOSICAO 9');
insert into tipo_proposicao (id,sigla,nome,descricao) values (10,'JJJ','NOME TIPOM PROPOSICAO 10','DESCRITION TIPO PROPOSICAO 10');
-- INSERT NA PROPOSICAO
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (1,'EMENTA EXEMPlO 1', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 1', 'TEXT EMENTA 1',1);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (2,'EMENTA EXEMPlO 2', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 2', 'TEXT EMENTA 2',2);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (3,'EMENTA EXEMPlO 3', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 3', 'TEXT EMENTA 3',3);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (4,'EMENTA EXEMPlO 4', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 4', 'TEXT EMENTA 4',4);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (5,'EMENTA EXEMPlO 5', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 5', 'TEXT EMENTA 5',5);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (6,'EMENTA EXEMPlO 6', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 6', 'TEXT EMENTA 6',6);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (7,'EMENTA EXEMPlO 7', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 7', 'TEXT EMENTA 7',7);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (8,'EMENTA EXEMPlO 8', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 8', 'TEXT EMENTA 8',8);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (9,'EMENTA EXEMPlO 9', '2016-06-11', 'EMENTA DETAlHE EXAMPlE 9', 'TEXT EMENTA 9',9);
insert into proposicao (id,ementa,data_apresentacao,ementa_detalhada, texto, tipo_proposicao_id) values (10,'EMENTA EXEMPlO 10','2016-06-11','EMENTA DETAlHE EXAMPlE 10','TEXT EMENTA 10',10);
-- INSERT unidade_federativa (Necessário para insert de deputado)
insert into unidade_federativa (sigla, nome) values ('SP','Sao Paulo');
insert into unidade_federativa (sigla, nome) values ('RJ','Rio de Janeiro');
-- INSERT Deputado
insert into deputado (id,unidade_federativa_sigla, nome, sigla_partido) values ('1','SP', 'Deputado1', 'PT');
insert into deputado (id,unidade_federativa_sigla, nome, sigla_partido) values ('2','RJ', 'Deputado2', 'PR');
 -- INSERT votacao
insert into votacao (id, proposicao_id, data_votacao) values ('1', '1', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('2', '2', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('3', '3', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('4', '4', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('5', '5', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('6', '6', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('7', '7', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('8', '8', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('9', '9', '2016-06-12');
insert into votacao (id, proposicao_id, data_votacao) values ('10', '10', '2016-06-12');
--INSERT votos do deputado 1
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '1', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '2', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '3', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '4', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '5', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '6', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '7', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '8', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '9', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('1', '10', true);
--INSERT votos do deuputado id 2
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '1', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '2', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '3', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '4', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '5', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '6', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '7', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '8', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '9', true);
insert into voto_deputado (deputado_id,votacao_id,voto) values ('2', '10', true);
--INSERT votos do eleitor 1
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '1', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '2', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '3', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '4', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '5', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '6', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '7', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '8', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '9', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('1', '10', false);
--INSERT votos do eleitor id 2
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '1', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '2', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '3', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '4', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '5', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '6', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '7', false);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '8', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '9', true);
insert into voto_eleitor (eleitor_id,proposicao_id,voto) values ('2', '10', false);

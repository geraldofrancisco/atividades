CREATE TABLE movimento(
       id_atividade BIGINT NOT NULL,
       id_pessoa BIGINT NOT NULL,
       inicio TIMESTAMP,
       fim TIMESTAMP,
       concluido BOOLEAN NOT NULL
);

ALTER TABLE movimento ADD PRIMARY KEY (id_atividade, id_pessoa);

ALTER TABLE movimento ADD FOREIGN KEY (id_atividade) REFERENCES atividade(id);

ALTER TABLE movimento ADD FOREIGN KEY (id_pessoa) REFERENCES pessoa(id);
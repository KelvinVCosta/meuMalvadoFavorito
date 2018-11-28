CREATE TABLE "unidade_federativa" (
  "sigla" varchar(2) NOT NULL,
  "nome" varchar(50),
  CONSTRAINT "unidade_federativa_pkey" PRIMARY KEY("sigla")
)
WITH (
  OIDS = False
);
ALTER TABLE "unidade_federativa" OWNER TO "postgres";

CREATE TABLE "deputado" (
  "id" int4 NOT NULL,
  "unidade_federativa_sigla" varchar(2),
  "nome" varchar(100),
  "sigla_partido" varchar(10),
  CONSTRAINT "deputado_pkey" PRIMARY KEY("id"),
  CONSTRAINT "pertence" FOREIGN KEY ("unidade_federativa_sigla")
  REFERENCES "unidade_federativa"("sigla")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE
)
WITH (
  OIDS = False
);
ALTER TABLE "deputado" OWNER TO "postgres";

CREATE TABLE "eleitor" (
  "id" SERIAL NOT NULL,
  "email" varchar(100),
  "senha" varchar(32),
  CONSTRAINT "eleitor_pkey" PRIMARY KEY("id")
)
WITH (
  OIDS = False
);
ALTER TABLE "eleitor" OWNER TO "postgres";

CREATE TABLE "keyword" (
  "id" SERIAL NOT NULL,
  "keyword" varchar(100),
  CONSTRAINT "keyword_pkey" PRIMARY KEY("id")
)
WITH (
  OIDS = False
);
ALTER TABLE "keyword" OWNER TO "postgres";

CREATE TABLE "tipo_proposicao" (
  "id" int4 NOT NULL,
  "sigla" varchar(3),
  "nome" varchar(500),
  "descricao" varchar(1000),
  CONSTRAINT "tipo_proposicao_pkey" PRIMARY KEY("id")
)
WITH (
  OIDS = False
);
ALTER TABLE "tipo_proposicao" OWNER TO "postgres";

CREATE TABLE "proposicao" (
  "id" int4 NOT NULL,
  "ementa" varchar,
  "data_apresentacao" date,
  "ementa_detalhada" text,
  "texto" text,
  "tipo_proposicao_id" int4,
  CONSTRAINT "proposicao_pkey" PRIMARY KEY("id"),
  CONSTRAINT "classifica" FOREIGN KEY ("tipo_proposicao_id")
  REFERENCES "tipo_proposicao"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE
)
WITH (
  OIDS = False
);
ALTER TABLE "proposicao" OWNER TO "postgres";

CREATE TABLE "proposicao_keyword" (
  "proposicao_id" int4 NOT NULL,
  "keyword_id" int4 NOT NULL,
  CONSTRAINT "proposicao_keyword_pkey" PRIMARY KEY("proposicao_id","keyword_id"),
  CONSTRAINT "lista" FOREIGN KEY ("proposicao_id")
  REFERENCES "proposicao"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE,
  CONSTRAINT "contem" FOREIGN KEY ("keyword_id")
  REFERENCES "keyword"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE
)
WITH (
  OIDS = False
);
ALTER TABLE "proposicao_keyword" OWNER TO "postgres";

CREATE TABLE "votacao" (
  "id" int4 NOT NULL,
  "proposicao_id" int4,
  "data_votacao" date,
  CONSTRAINT "votacao_pkey" PRIMARY KEY("id"),
  CONSTRAINT "possui" FOREIGN KEY ("proposicao_id")
  REFERENCES "proposicao"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE
)
WITH (
  OIDS = False
);
ALTER TABLE "votacao" OWNER TO "postgres";

CREATE TABLE "voto_deputado" (
  "deputado_id" int4 NOT NULL,
  "votacao_id" int4 NOT NULL,
  "voto" bool,
  CONSTRAINT "voto_deputado_pkey" PRIMARY KEY("deputado_id","votacao_id"),
  CONSTRAINT "votou" FOREIGN KEY ("deputado_id")
  REFERENCES "deputado"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE,
  CONSTRAINT "realizado" FOREIGN KEY ("votacao_id")
  REFERENCES "votacao"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE
)
WITH (
  OIDS = False
);
ALTER TABLE "voto_deputado" OWNER TO "postgres";

CREATE TABLE "voto_eleitor" (
  "proposicao_id" int4 NOT NULL,
  "eleitor_id" int4 NOT NULL,
  "voto" bool,
  CONSTRAINT "voto_eleitor_pkey" PRIMARY KEY("proposicao_id","eleitor_id"),
  CONSTRAINT "decide" FOREIGN KEY ("proposicao_id")
  REFERENCES "proposicao"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE,
  CONSTRAINT "vota" FOREIGN KEY ("eleitor_id")
  REFERENCES "eleitor"("id")
  MATCH SIMPLE
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
  NOT DEFERRABLE
)
WITH (
  OIDS = False
);
ALTER TABLE "voto_eleitor" OWNER TO "postgres";

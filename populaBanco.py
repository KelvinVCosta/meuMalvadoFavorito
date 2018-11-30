import requests
import pyodbc

conn_str = (
    "DRIVER={PostgreSQL ODBC Driver(ANSI)};"
    "DATABASE = dispicables;"
    "UID = postgres;"
    "PWD = admin;"
    "SERVER = localhost;"
    "PORT = 5432;"
    )
conn = pyodbc.connect(conn_str)

def lista_proposicoes():
    url = "https://dadosabertos.camara.leg.br/api/v2/proposicoes"
    querystring = {"ordem":"ASC", "ordernarPor":"id", "siglaTipo":"PL", "ano":"2018"}
    headers = {'Cache-Control':"no-cache"}
    response = requests.request("GET", url, headers=headers, params=querystring)
    data = response.json().get("dados")
    return data

def unidade_federativa():
    url = "https://dadosabertos.camara.leg.br/api/v2/uf"
    headers = {'Cache-Control':"no-cache", 'accept':'application/json'}
    response = requests.request("GET", url, headers=headers)
    data = response.json().get("dados")
    for row in data:
        sql = """
                INSERT INTO public.unidade_federativa(sigla, nome)
                VALUES (?, ?):
              """
        params = (row['sigla'], row['nome'])
        print(params)
        conn.execute(sql, params)
        conn.commit()

def deputado():
    for i in range(1,36):
        url = "https://dadosabertos.camara.leg.br/api/v2/deputados?pagina={}&ordem=ASC&ordernarPor=id".format(i)
        print(url)
        headers = {'Cache-Control':"no-cache", 'accept':'application/json'}
        response = requests.request("GET", url, headers=headers)
        data = response.json().get("dados")
        for row in data:
            sql = """
                    INSERT INTO public.deputado(id, unidade_federativa_sigla, nome, sigla_partido)
                    VALUE(?, ?, ?, ?);
                  """
            params = (row['id'], row['siglaUf'], row['nome'], row['siglaPartido'])
            print(params)
            conn.execute(sql, params)
            conn.commit()

def tipo_proposicao():
    url = "https://dadosabertos.camara.leg.br/api/v2/tiposProposicao"
    headers = {'Cache-Control':"no-cache", 'accept':'application/json'}
    response = requests.request("GET", url, headers=headers)
    data = response.json().get("dados")
    for row in data:
        sql = """
                INSERT INTO public.tipo_proposicao(id, sigla, nome, descricao)
                VALUES(?, ?, ?, ?);
              """
        params = (row['id'], row['sigla'], row['nome'], row['descricao'])
        print(params)
        conn.execute(sql, params)
        conn.commit()

tipo_proposicao()
# unidade_federativa()
# deputado()

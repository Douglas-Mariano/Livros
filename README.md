# Projeto Spring Simples

Este é um projeto Spring simples que permite a criação e a recuperação de registros de livros. O projeto utiliza o Spring Boot, um popular framework Java para construir aplicações web.

## Requisitos
- Java 8 ou superior
- Maven

## Instalação
1. Clone o repositório utilizando o comando `git clone https://github.com/seu-username/projeto-spring-simples.git`
2. Abra o projeto em sua IDE preferida
3. Configure as propriedades de conexão com o banco de dados no arquivo `application.properties`, localizado na pasta `src/main/resources`
4. Execute o projeto executando o método `main` na classe `SpringSimpleProjectApplication.java`
5. Utilize um cliente HTTP, como o Postman, para testar os endpoints da API

## Endpoints da API
Os seguintes endpoints estão disponíveis neste projeto:

| Endpoint           | Método HTTP | Descrição                                                   |
|--------------------|-------------|-------------------------------------------------------------|
| /api/v1/livros     | POST        | Cria um novo registro de livro no banco de dados             |
| /api/v1/livros/{id}| GET         | Recupera um registro de livro do banco de dados pelo seu ID   |

### Exemplo de Requisição e Resposta

#### POST /api/v1/livros

Corpo da requisição:
```json
{
  "nome": "O Senhor dos Anéis",
  "paginas": 423,
  "capitulos": 1,
  "editora": "HarperCollins",
  "autor": {
    "nome": "J.R.R. Tolkien",
    "ano": 1954
  }
}
```

Corpo da resposta:
```json
{
    "mensagem": "Livro adicionado com sucesso!"
}
```

#### GET /api/v1/livros/{id}

Corpo da resposta:
```json
{
  "id": 1,
  "nome": "O Senhor dos Anéis",
  "paginas": 423,
  "capitulos": 1,
  "editora": "HarperCollins",
  "autor": {
    "id": 2,
    "nome": "J.R.R. Tolkien",
    "ano": 1954
  }
}
```

## Créditos
Este projeto foi criado por Douglas como parte de sua jornada de aprendizado em Spring. Com o curso Comece a aprender Spring Boot agora de forma prática de Rodrigo Peleias.
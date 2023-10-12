<h1 align="center">produtos-spring</h1>
API REST desenvolvida em Java + Spring Boot para gerenciamento de um estoque de produtos.

## Desenvolvimento
- Setup inicial de projeto com o Spring Boot Initializr.
- Criação de modelo de dados para o mapeamento de entidades em bancos de dados.
- Desenvolvimento de operações de gerenciamento de usuários (cadastro, leitura, atualização e remoção de produtos de um sistema).
- Relação de cada uma das operações acima com o padrão arquitetural REST.
- Testes via Postman.

## Criando o build da aplicação
- Na pasta do projeto, abra o terminal e execute o comando abaixo para buildar e instalar o projeto:
<blockquote>
mvn install 
</blockquote>

## Consumindo a API
### Localmente com Docker

- Na pasta do projeto, abra o terminal e execute o comando abaixo para criar e rodar os containers da aplicação: 
<blockquote>
docker-compose up
</blockquote>

## Documentação 

Depois de executados os containers, acesse a documentação Swagger da API pelo endereço http://localhost:8080/swagger-ui.html do seu browser para ter acesso aos recursos disponíveis na API.

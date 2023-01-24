# Avaliação Back-End

### Desafio:

Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:
* Criar uma pessoa <br/>
  &check; Criado service salvar (POST).


* Editar uma pessoa<br/>
  &check; Criado service editar (PATCH).


* Consultar uma pessoa<br/>
  &check; Criado service buscaPorNumeroCadastro (GET com parametro).


* Listar pessoas<br/>
  &check; Criado service listarPessoas (GET sem parametro).


* Criar endereço para pessoa<br/>
  &check; A classe Pessoa possui um atributo enderecoPrincipal .


* Listar endereços da pessoa<br/>
  &check; A classe Pessoa possui um atributo do tipo List que armazena todos os enderecos que são salvos(POST,PATCH) no atributo enderecoPrincipal. 


* Poder informar qual endereço é o principal da pessoa.<br/>
  &check; A classe Pessoa possui um atributo enderecoPrincipal.

Uma Pessoa deve ter os seguintes campos:
* Nome
* Data de nascimento
* Endereço: 
  * Logradouro 
  * CEP 
  * Número
  * Cidade
  

#### A API está documentada com Swagger.
<http://localhost:8080/swagger-ui/index.htm>

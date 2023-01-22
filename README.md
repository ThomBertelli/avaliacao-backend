# Avaliação Back-End

### Desafio:

Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:
* Criar uma pessoa <br/>
  &check; Criado método POST.


* Editar uma pessoa<br/>
  &check; Criado método PATCH.


* Consultar uma pessoa<br/>
  &check; Criado método GET com parametro numeroCadastro.


* Listar pessoas<br/>
  &check; Criado método GET sem parametro lista todas as pessoas.


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
  



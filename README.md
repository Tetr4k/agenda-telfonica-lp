# Agenda Telefonica

Esta é uma implementação de uma agenda telefonica usando uma lista de objetos para o 3º trabalho de Linguagens de Programação do curso de Ciência da Computação na UFF-PURO no periodo remoto de 2021-1.

## Linguagem

Para a implementação desse trabalho foi escolhida a linguagem Java, por se tratar de um programa seguindo o paradigma Orientação a Objetos.
Será usado a plataforma [Replit](https://replit.com/) para desenvolvimento.

## Implementação

* Os contatos da agenda serão objetos da classe Contato, contendo nome, telefone, endereço e relação;
* A agenda será um objeto da classe Agenda, contendo uma lista de Contatos;
* Esses objetos serão implementados na classe Principal;
* Implementar o método busca() na Agenda. Recebe um nome, ou parte deste, e retorna o Contato(o primeiro);
* Implementar os métodos de inserção, alteração e remoção de Contatos da Agenda(Caso o nome de um contato já exista na agenda, a inserção se torna uma alteração);
* Implementar o método listar() na Agenda, que escreve os Contatos.(crie um método toString(), na classe contato);
* Implementar os métodos salvar() e recuperar(), que manipulam os contatos em arquivos;

## Uso

* Inserir o Contato "Fulano", 99999999, "Rua A", "UFF";
* Inserir o Contato "Ciclano", 88888888, "Rua B", "Cederj";
* Inserir o Contato "Beltrano", 88889999, "Rua C", "Infância";
* Inserir o Contato "Fulano", 77777777, "Rua D", none;
* Remover o Contato "Ciclano";
* Listar o conteudo da Agenda;

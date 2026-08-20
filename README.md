# Projeto Controle de Console - POO

## O que é este projeto?
Este projeto foi desenvolvido para a aula de Programação Orientada a Objetos (POO). Ele simula um **Controle de Console** de videogame no mundo real, permitindo guardar suas principais características e alterar o seu estado.

## Atributos da Classe `Controle`
* **`nome`**: O modelo ou nome do controle.
* **`preco`**: O valor do controle.
* **`cor`**: A cor do dispositivo.
* **`wireless`**: Define se o controle é sem fio (`true`) ou com fio (`false`).

## Métodos Criados
1. **`alternarConexao(boolean wireless)`**: Altera a forma como o controle está conectado (seja mudando para sem fio ou para cabo) e imprime uma mensagem na tela.
2. **`atualizarPreco(Double novoPreco)`**: Atualiza o preço do controle. Possui uma validação simples com `if` para garantir que o preço não seja zero ou negativo.

## Como Executar
Basta rodar a classe principal (`SistemaPrincipal.java`), que irá criar o objeto `Controle`, exibir seus dados iniciais e testar os métodos de alteração de preço e conexão.